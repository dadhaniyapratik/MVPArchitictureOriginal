package com.mvparchiticture.ui.country

import android.annotation.SuppressLint
import com.mvparchiticture.R
import com.mvparchiticture.application.MVPArchitictureApplication
import com.mvparchiticture.data.exceptions.ExceptionManager
import com.mvparchiticture.ui.common.base.listeners.NetworkListener
import com.mvparchiticture.ui.common.base.mvp.presenter.BasePresenterImpl
import com.mvparchiticture.util.CommonUtils
import com.mvparchiticture.util.extensions.applySchedulers
import com.mvparchiticture.util.rest.RestWebCaller


@SuppressLint("CheckResult")
class CountryPresenter : BasePresenterImpl<CountryView>() {

    fun getCountryList() {

        CommonUtils.checkInternetConnection(MVPArchitictureApplication.instance)
                .subscribe { isInternetOn ->
                    if (isInternetOn) {
                        RestWebCaller.getCountry()
                                .applySchedulers()
                                .doOnSubscribe {
                                    onShowProgress()
                                }
                                .doFinally {
                                    onHideProgress()
                                }.subscribe({
                                    mvpView?.onCountryReceived(it)
                                }, {
                                    ExceptionManager.consumerThrowable({ mvpView }).accept(it)
                                })
                    } else {
                        mvpView?.showNetworkError(null,
                                R.string.base_info_error,
                                R.string.error_no_internet_connection,
                                object : NetworkListener {
                                    override fun onRetry() {
                                        getCountryList()
                                    }
                                })
                    }
                }

    }

}