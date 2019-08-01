package com.mvparchiticture.util.extensions

import com.mvparchiticture.data.exceptions.ExceptionManager
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.functions.Function
import java.util.concurrent.CancellationException

/**
 * Created by Artem Kopan for MyMoodAndMe
 * 26.05.17
 */


/*@Suppress("NON_EXHAUSTIVE_WHEN")
inline fun <T> Single<T>.processingException(policy: ExceptionPolicy, crossinline block: () -> SingleSource<T>): Single<T> {
    return this.onErrorResumeNext(Function { ex ->
        when (policy) {
            ExceptionPolicy.API, ExceptionPolicy.API_400, ExceptionPolicy.API_500 -> {
                var code: Int? = null
                if (ex is ApiException) {
                    code = ex.code
                } else if (ex is HttpException) {
                    code = ex.code()
                }
                if (code != null && code > 0) {
                    if (policy == ExceptionPolicy.API_400 && code in 400..499) {
                        return@Function block()
                    } else if (policy == ExceptionPolicy.API_500 && code in 500..599) {
                        return@Function block()
                    }
                }
            }
            ExceptionPolicy.ALL -> return@Function block()
        }
        return@Function Single.error(ex)
    })
}*/


inline fun <T> Observable<T>.onErrorResumeEmpty(crossinline block: (Throwable) -> Boolean): Observable<T> {
    return this.onErrorResumeNext(Function {
        return@Function if (block(it)) Observable.empty() else Observable.error(it)
    })
}

//==============================================================================================
// Handle ApiException
//==============================================================================================
//region methods

fun <T> Observable<T>.handleException(): Observable<T> {
    return this.onErrorResumeNext(Function {
        return@Function if (it is CancellationException) {
            Observable.never()
        } else {
            Observable.error(ExceptionManager.transformToApiException(it))
        }
    })
}

fun <T> Single<T>.handleException(): Single<T> {
    return this.onErrorResumeNext(Function {
        return@Function if (it is CancellationException) {
            Single.never()
        } else {
            Single.error(ExceptionManager.transformToApiException(it))
        }
    })
}

fun Completable.handleException(): Completable {
    return this.onErrorResumeNext(Function {
        return@Function if (it is CancellationException) {
            Completable.never()
        } else {
            Completable.error(ExceptionManager.transformToApiException(it))
        }
    })
}

//endregion



