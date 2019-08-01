package com.mvparchiticture.ui

import android.os.Bundle
import android.view.View
import com.mvparchiticture.ui.common.base.dialog.DialogProvider
import com.mvparchiticture.ui.common.base.listeners.NetworkListener
import com.mvparchiticture.ui.common.base.mvp.fragment.BaseFragment
import com.mvparchiticture.ui.common.base.mvp.presentation.Presentation
import com.mvparchiticture.ui.common.base.mvp.presenter.BasePresenter
import com.mvparchiticture.ui.common.base.mvp.view.BaseView
import com.mvparchiticture.util.Constants
import com.mvparchiticture.util.extensions.gone
import com.mvparchiticture.util.extensions.visible

open class AppBaseFragment <P : BasePresenter<V>, V : BaseView> : BaseFragment<P, V>() {
     var dialogProvider: DialogProvider? = null

    override fun onInflateLayout() = View.NO_ID

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dialogProvider = DialogProvider()
    }
    override fun showError(tag: Any?, title: Int, error: String?) {
        dialogProvider?.showError(this, title, error)
    }

    override fun showError(tag: Any?, error: String?) {
        dialogProvider?.showError(this, error)
    }

    override fun showSuccess(tag: Any?, title: Int, error: String?) {
        dialogProvider?.showMessage(this, title, error)
    }

    override fun showSuccess(tag: Any?, error: String?) {
        dialogProvider?.showMessage(this, error)
    }

    override fun showProgress(tag: Any?) {
        manageView(Constants.MANAGE_VIEW.SHOW_PROGRESS)
    }

    override fun hideProgress(tag: Any?) {
        dialogProvider?.dismissProgress()
        manageView(Constants.MANAGE_VIEW.SHOW_LAYOUT)
    }

    override fun showNetworkError(tag: Any?, title: Int, description: Int, networkListener: NetworkListener?) {
        manageView(Constants.MANAGE_VIEW.SHOW_NO_INTERNET_CONNETCTION)
    }

    override fun showUnAuthorized(message: String?) {
        presenter?.onUserUnauthorized(message)
    }



    override fun getViewPresentation(): Presentation {
        return this
    }

    private fun manageView(showLayout: Int) {
        when (showLayout) {
            Constants.MANAGE_VIEW.SHOW_LAYOUT -> {
                baseLayout.visible()
                mProgressbar.gone()
                mNoInternetConnection.gone()

            }
            Constants.MANAGE_VIEW.SHOW_PROGRESS -> {
                baseLayout.gone()
                mProgressbar.visible()
                mNoInternetConnection.gone()

            }
            Constants.MANAGE_VIEW.SHOW_NO_INTERNET_CONNETCTION -> {
                baseLayout.gone()
                mProgressbar.gone()
                mNoInternetConnection.visible()
            }

        }

    }
}