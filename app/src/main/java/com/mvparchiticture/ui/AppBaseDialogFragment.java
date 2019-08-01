package com.mvparchiticture.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mvparchiticture.ui.common.base.dialog.DialogProvider;
import com.mvparchiticture.ui.common.base.listeners.NetworkListener;
import com.mvparchiticture.ui.common.base.mvp.dialog.BaseDialogFragment;
import com.mvparchiticture.ui.common.base.mvp.presentation.Presentation;
import com.mvparchiticture.ui.common.base.mvp.presenter.BasePresenter;
import com.mvparchiticture.ui.common.base.mvp.view.BaseView;
import com.mvparchiticture.util.Constants;

public abstract class AppBaseDialogFragment<P extends BasePresenter<V>, V extends BaseView> extends BaseDialogFragment<P, V> {

    public DialogProvider dialogProvider = null;


   /* @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return manager.inflateLayout(inflater, container);
    }
*/
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dialogProvider = new DialogProvider();
    }

    @Override
    public void showError(@Nullable Object tag, int title, String error) {
        dialogProvider.showError(this, title, error);
    }

    @Override
    public void showError(@Nullable Object tag, String error) {
        dialogProvider.showError(this, error);
    }

    @Override
    public void showSuccess(@Nullable Object tag, int title, String error) {
        dialogProvider.showMessage(this, title, error);
    }

    @Override
    public void showSuccess(@Nullable Object tag, String error) {
        dialogProvider.showMessage(this, error);
    }

    @Override
    public void showProgress(@Nullable Object tag) {
        manageView(Constants.MANAGE_VIEW.SHOW_PROGRESS);
    }

    @Override
    public void hideProgress(@Nullable Object tag) {
        dialogProvider.dismissProgress();
        manageView(Constants.MANAGE_VIEW.SHOW_LAYOUT);
    }

    @Override
    public void showNetworkError(@Nullable Object tag, int title, int description, NetworkListener networkListener) {
        manageView(Constants.MANAGE_VIEW.SHOW_NO_INTERNET_CONNETCTION);
    }

    @Override
    public void showUnAuthorized(String message) {
        presenter.onUserUnauthorized(message);
    }

    @Override
    public Presentation getViewPresentation() {
        return this;
    }

    private void manageView(int showLayout) {
        switch (showLayout) {
            case Constants.MANAGE_VIEW.SHOW_LAYOUT: {
         /*       baseLayout.setVisibility(View.VISIBLE);
                mProgressbar.setVisibility(View.GONE);
                mNoInternetConnection.setVisibility(View.GONE);*/

            }
            case Constants.MANAGE_VIEW.SHOW_PROGRESS: {
              /*  baseLayout.setVisibility(View.GONE);
                mProgressbar.setVisibility(View.VISIBLE);
                mNoInternetConnection.setVisibility(View.GONE);*/

            }
            case Constants.MANAGE_VIEW.SHOW_NO_INTERNET_CONNETCTION: {
                /*baseLayout.setVisibility(View.GONE);
                mProgressbar.setVisibility(View.GONE);
                mNoInternetConnection.setVisibility(View.VISIBLE);*/
            }

        }

    }
}
