package com.mvparchiticture.ui


import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.support.v4.widget.SwipeRefreshLayout
import android.view.MenuItem
import android.view.View
import com.artemkopan.utils.rx.RxViewsClick
import com.mvparchiticture.R
import com.mvparchiticture.ui.common.base.dialog.DialogProvider
import com.mvparchiticture.ui.common.base.listeners.NetworkListener
import com.mvparchiticture.ui.common.base.mvp.activity.BaseActivity
import com.mvparchiticture.ui.common.base.mvp.presentation.Presentation
import com.mvparchiticture.ui.common.base.mvp.presenter.BasePresenter
import com.mvparchiticture.ui.common.base.mvp.view.BaseView
import com.mvparchiticture.util.Constants
import com.mvparchiticture.util.extensions.gone
import com.mvparchiticture.util.extensions.visible
import kotlinx.android.synthetic.main.activity_country.*
import kotlinx.android.synthetic.main.layout_toolbar.*

@SuppressLint("CheckResult")
open class AppBaseActivity<P : BasePresenter<V>, V : BaseView> : BaseActivity<P, V>(), SwipeRefreshLayout.OnRefreshListener {
    override fun onRefresh() {
//        Handler().postDelayed(Runnable {
//            // Stop animation (This will be after 3 seconds)
//            swiperefresh.isRefreshing = false
//        }, 4000) // Delay in millis
    }


    override fun onInflateLayout() = View.NO_ID

    private var dialogProvider: DialogProvider? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (swiperefresh != null)
            swiperefresh.setOnRefreshListener(this)
        dialogProvider = DialogProvider()
        onToolbarInit(R.id.toolbar)
        ivToolbarRight.gone()
        tvToolbarMiddle.gone()
        ivToolbarMiddle.gone()
        ivToolbarLeft.gone()
        tvToolbarRight.gone()

        RxViewsClick.create(ivToolbarLeft, ivToolbarRight).subscribe {
            when (it.id) {
                R.id.ivToolbarLeft -> {
                    onBackPressed()
                }
                R.id.ivToolbarRight -> {
                    finish()
                }
            }
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            // NavUtils.navigateUpFromSameTask(this)
            onBackPressed()
            return true
        } else {
            return super.onOptionsItemSelected(item)
        }
    }

    override fun showError(tag: Any?, title: Int, error: String) {
        dialogProvider?.showError(this, title, error)
    }

    override fun showError(tag: Any?, error: String?) {
        dialogProvider?.showError(this, error)
    }

    override fun showSuccess(tag: Any?, title: Int, error: String) {
        dialogProvider?.showMessage(this, title, error)
    }

    override fun showSuccess(tag: Any?, error: String?) {
        dialogProvider?.showMessage(this, error)
    }

    override fun showProgress(tag: Any?) {
        //dialogProvider?.showProgress(this)
        manageView(Constants.MANAGE_VIEW.SHOW_PROGRESS)
    }

    override fun hideProgress(tag: Any?) {
        dialogProvider?.dismissProgress()
        manageView(Constants.MANAGE_VIEW.SHOW_LAYOUT)
    }

    override fun getViewPresentation(): Presentation {
        return this
    }

    override fun showUnAuthorized(message: String) {
        presenter?.onUserUnauthorized(message)
    }


    override fun showNetworkError(tag: Any?, title: Int, description: Int, networkListener: NetworkListener?) {
        mRetryButton.setOnClickListener {
            networkListener?.onRetry()
        }
        manageView(Constants.MANAGE_VIEW.SHOW_NO_INTERNET_CONNETCTION)
        //dialogProvider?.showRetryDialog(this, title, description, networkListener)

    }

    public fun hideToolbar(visibility: Boolean) {
        if (visibility) {
            mToolbar.visible()
        } else {
            mToolbar.gone()
        }
        //mToolbar.visibility =

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

    fun isValidEmail(inputEmail: String): Boolean {
        if (inputEmail.trim().equals("")) {
            return true
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(inputEmail).matches()
        }
    }

    fun manageToolbar(ivLeft: Boolean, tvMiddle: Boolean, tvToolbarMiddleText: String, ivMiddle: Boolean, tvRight: Boolean, tvToolbarRightText: String, ivRight: Boolean) {
        ivToolbarRight.gone()
        tvToolbarMiddle.gone()
        ivToolbarMiddle.gone()
        ivToolbarLeft.gone()
        tvToolbarRight.gone()
        if (ivLeft) {
            ivToolbarLeft.visible()
        }
        if (ivMiddle) {
            ivToolbarMiddle.visible()
        }
        if (ivRight) {
            ivToolbarRight.visible()
        }
        if (tvMiddle) {
            tvToolbarMiddle.visible()
            tvToolbarMiddle.text = tvToolbarMiddleText
        }
        if (tvRight) {
            tvToolbarRight.visible()
            tvToolbarRight.text = tvToolbarRightText
        }
    }


}