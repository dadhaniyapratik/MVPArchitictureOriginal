package com.mvparchiticture.data.exceptions

import com.artemkopan.utils.ExtraUtils
import com.mvparchiticture.R
import com.mvparchiticture.application.MVPArchitictureApplication
import com.mvparchiticture.data.model.response.ErrorResponse
import com.mvparchiticture.ui.common.base.mvp.view.BaseView
import com.mvparchiticture.util.extensions.readValue
import com.mvparchiticture.util.rest.JSONUtils
import io.reactivex.functions.Consumer
import retrofit2.HttpException
import timber.log.Timber
import java.lang.Exception
import java.net.SocketTimeoutException
import java.net.UnknownHostException


/**
 * Created by Artem Kopan for our-bible
 * 18.01.17
 */

object ExceptionManager {


    inline fun consumerThrowable(crossinline callback: () -> BaseView?,
                                 showConcatMessage: Boolean = true,
                                 errorTag: Any? = null): Consumer<Throwable> {
        return consumerThrowable(callback, showConcatMessage, errorTag, {})
    }

    inline fun consumerThrowable(crossinline callback: () -> BaseView?,
                                 showConcatMessage: Boolean = true,
                                 errorTag: Any? = null,
                                 crossinline endAction: () -> Unit): Consumer<Throwable> {
        return Consumer {
            Timber.e(it)
            when (it) {
                is UnknownHostException -> callback()?.showError(errorTag, MVPArchitictureApplication.instance.getString(R.string.error_no_internet_connection))
                        ?: mvpNull()
                is SocketTimeoutException -> callback()?.showError(errorTag, MVPArchitictureApplication.instance.getString(R.string.error_timeout))
                        ?: mvpNull()
                is ApiException -> {
                    callback()?.showError(errorTag, it.message) ?: mvpNull()
                }
                else -> callback()?.showError(errorTag, it.message) ?: mvpNull()
            }
            endAction()
        }
    }

    inline fun consumerThrowable(crossinline callback: () -> BaseView?,
                                 errorTag: Any? = null,
                                 message: String?, crossinline endAction: () -> Unit): Consumer<Throwable> {
        return Consumer {
            callback()?.showError(errorTag, message) ?: mvpNull()
            endAction()
        }
    }


    fun transformToApiException(ex: Throwable): Throwable {
        ExtraUtils.checkBackgroundThread()
        try {

            if(ex is SocketTimeoutException){

            }

            if (ex is HttpException) {
                val response = ex.response().errorBody()?.string()
                val errorResponse = JSONUtils.getJsonMapper().readValue<ErrorResponse>(response!!)
                return ApiException(ex.code(),errorResponse.message)

            } else if (ex is UnknownHostException) {
                return ApiException(-1, MVPArchitictureApplication.instance.getString(R.string.error_no_internet_connection))
            } else if (ex is SocketTimeoutException) {
                return ApiException(-2, MVPArchitictureApplication.instance.getString(R.string.error_timeout))
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return ex
    }


    fun mvpNull() {
        Timber.w("MvpView is null")
    }


    class ApiException(val code: Int, message: String?) : Exception(message)

}
