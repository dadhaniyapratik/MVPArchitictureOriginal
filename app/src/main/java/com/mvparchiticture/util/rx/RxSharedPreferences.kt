package com.mvparchiticture.util.rx

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import com.mvparchiticture.BuildConfig
import com.mvparchiticture.application.MVPArchitictureApplication
import io.reactivex.Completable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers
import timber.log.Timber

/**
 * Created by Artem Kopan for MyMoodAndMe
 * 14.03.17
 */
object RxSharedPreferences {

    val prefsName: String = "${BuildConfig.APPLICATION_ID}_secure_pref_v1"
    val preferences: SharedPreferences = MVPArchitictureApplication.instance.getSharedPreferences(prefsName, Context.MODE_PRIVATE)

    fun <T> putValue(key: String, value: T,
                     onComplete: Action = Action {},
                     onError: Consumer<in Throwable> = Consumer { Timber.e(it) }) {
        putValue(key, value).subscribe(onComplete, onError)
    }

    @SuppressLint("CommitPrefEdits")
    fun <T> putValue(key: String, value: T): Completable {
        return Completable.create {
            val editor = preferences.edit()
            when (value) {
                is String -> editor.putString(key, value)
                is Int -> editor.putInt(key, value)
                is Boolean -> editor.putBoolean(key, value)
                is Long -> editor.putLong(key, value)
                else -> {
                    it.onError(Throwable("Error putting in shared preferences: Unsupported type"))
                    return@create
                }
            }
            editor.commit()
            it.onComplete()
        }.subscribeOn(Schedulers.computation())
    }

    fun getString(key: String, fallback: String = ""): String = preferences.getString(key, fallback)

    fun getBoolean(key: String, fallback: Boolean = false): Boolean = preferences.getBoolean(key, fallback)

    fun getInt(key: String, fallback: Int = 0): Int = preferences.getInt(key, fallback)

    fun getLong(key: String, fallback: Long = 0L): Long = preferences.getLong(key, fallback)

    fun removeValue(key: String) = preferences.edit().remove(key).apply()

    fun removeAll() = preferences.edit().clear().apply()

    fun contains(key: String): Boolean = preferences.contains(key)

}