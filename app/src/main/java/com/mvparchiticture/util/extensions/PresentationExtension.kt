package com.mvparchiticture.util.extensions

import android.support.annotation.StringRes
import android.util.Patterns
import com.mvparchiticture.R
import com.mvparchiticture.ui.common.base.mvp.presenter.BasePresenterImpl
import com.mvparchiticture.ui.common.base.mvp.view.BaseView


fun <T : BaseView> BasePresenterImpl<T>.isEmptyField(value: String,
                                                     tag: Any?,
                                                     @StringRes errorRes: Int): Boolean {
    return isWrongField(tag, errorRes) { com.artemkopan.utils.StringUtils.isEmpty(value) }
}

fun <T : BaseView> BasePresenterImpl<T>.isWrongEmail(value: String,
                                                     tag: Any?,
                                                     @StringRes errorRes: Int): Boolean {
    return isWrongField(tag, errorRes) { !Patterns.EMAIL_ADDRESS.matcher(value.trim()).matches() }
}

fun <T : BaseView> BasePresenterImpl<T>.isWrongLength(value: String,
                                                      minLength: Int,
                                                      tag: Any?,
                                                      @StringRes errorRes: Int): Boolean {
    return isWrongField(tag, errorRes) { value.length < minLength }
}

fun <T : BaseView> BasePresenterImpl<T>.isWrongMaxVal(value: Int,
                                                      maxValue: Int,
                                                      tag: Any?,
                                                      @StringRes errorRes: Int): Boolean {
    return isWrongField(tag, errorRes) { value > maxValue }
}


inline fun <T : BaseView> BasePresenterImpl<T>.isWrongField(tag: Any?,
                                                            @StringRes errorRes: Int,
                                                            checkMethod: () -> Boolean): Boolean {
    if (checkMethod()) {
        this.mvpView?.showError(tag, errorRes)
        return true
    }
    return false
}
