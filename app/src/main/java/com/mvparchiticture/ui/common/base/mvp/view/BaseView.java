package com.mvparchiticture.ui.common.base.mvp.view;

import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.annotation.UiThread;

import com.mvparchiticture.ui.common.base.listeners.NetworkListener;
import com.mvparchiticture.ui.common.base.mvp.presentation.Presentation;


/**
 * Base interface that any class that wants to act as a View in the MVP (Model View BasePresenter)
 * pattern must implement. Generally this interface will be extended by a more specific interface
 * that then usually will be implemented by an Activity or Fragment.
 */
public interface BaseView {


    @UiThread
    void showError(@Nullable Object tag, @StringRes int title, String error);

    @UiThread
    void showSuccess(@Nullable Object tag, @StringRes int title, String error);


    @UiThread
    void showError(@Nullable Object tag, @StringRes int errorRes);

    @UiThread
    void showError(@Nullable Object tag, String error);

    @UiThread
    void showSuccess(@Nullable Object tag, String error);

    @UiThread
    void showProgress(@Nullable Object tag);

    @UiThread
    void hideProgress(@Nullable Object tag);

    @UiThread
    void showNetworkError(@Nullable Object tag, @StringRes int title, @StringRes int description, NetworkListener networkListener);

    Presentation getViewPresentation();

    @UiThread
    void showUnAuthorized(String message);

    @UiThread
    void redirectToLogin();

}