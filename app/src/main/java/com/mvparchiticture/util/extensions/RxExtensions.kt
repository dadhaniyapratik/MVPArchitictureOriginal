package com.mvparchiticture.util.extensions

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tbruyelle.rxpermissions2.RxPermissions
import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.Maybe
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.BiFunction
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit.MILLISECONDS

/**
 * Created by Artem Kopan for MyMoodAndMe
 * 09.03.17
 */


fun Single<RxPermissions>.request(vararg permissions: String): Single<Boolean> {
    return this.flatMap { it.request(*permissions).singleOrError() }
}




//==============================================================================================
// Delay
//==============================================================================================
//region methods

fun <T> Single<T>.applyDelay(delay: Long = 1000): Single<T> {
    return this.zipWith(Single.timer(delay, MILLISECONDS), BiFunction<T, Long, T> { t1, _ -> t1 })
}

//endregion

//==============================================================================================
// Schedulers
//==============================================================================================
//region methods

fun <T> Single<T>.applySchedulers(): Single<T> {
    return this.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
}

fun Completable.applySchedulers(): Completable {
    return this.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
}

fun <T> Maybe<T>.applySchedulers(): Maybe<T> {
    return this.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
}

fun <T> Flowable<T>.applySchedulers(): Flowable<T> {
    return this.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
}

fun <T> Observable<T>.applySchedulers(): Observable<T> {
    return this.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
}

//endregion


inline fun <reified T: Any> ObjectMapper.readValue(content: String): T = readValue(content, object: TypeReference<T>() {})