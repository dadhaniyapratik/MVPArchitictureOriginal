package com.mvparchiticture.ui.common.base.dialog;

import android.annotation.SuppressLint;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.DialogFragment;
import android.util.Log;

import com.mvparchiticture.R;
import com.mvparchiticture.ui.common.base.listeners.NetworkListener;
import com.mvparchiticture.ui.common.base.mvp.presentation.Presentation;
import com.mvparchiticture.util.Constants;


/**
 * Created by Artem Kopan for BaseProject
 * 09.10.2016
 */

@SuppressWarnings({"ConstantConditions", "WeakerAccess"})
public class DialogProvider {

    private static final String TAG = "DialogProvider";
    private ProgressDialog progressDialog;
    private MessageDialog messageDialog;

    //==============================================================================================
    // Progress Dialog
    //==============================================================================================
    //region methods
    public ProgressDialog showProgress(Presentation presentation) {
        return showProgress(presentation, R.string.base_info_loading);
    }

    @SuppressLint("ResourceType")
    public ProgressDialog showProgress(Presentation presentation, @StringRes int description) {
        return showProgress(presentation,
                            description > 0 ? presentation.getBaseActivity().getString(description) : null);
    }

    public ProgressDialog showProgress(Presentation presentation, String description) {
        if (progressDialog == null || !progressDialog.isShowing()) {
            if (progressDialog != null) progressDialog.dismiss();
            progressDialog = ProgressDialog.newInstance(description);
            progressDialog.show(presentation.getSupportFragmentManager());
        } else {
            progressDialog.setDescription(description);
        }
        progressDialog.setCancelable(false);

        return progressDialog;
    }

    //endregion

    public void dismissProgress() {
        dismissDialog(progressDialog);
        progressDialog = null;
    }

    //==============================================================================================
    // Message Dialog
    //==============================================================================================
    //region methods
    public MessageDialog showMessage(Presentation presentation, @StringRes int description) {
        return showMessage(presentation, R.string.base_info_success, description);
    }

    public MessageDialog showMessage(Presentation presentation, String description) {
        return showMessage(presentation, Constants.SUCCESS, presentation.getBaseActivity()
                                                     .getString(R.string.base_info_success), description);
    }

    public MessageDialog showError(Presentation presentation, String description) {
        return showMessage(presentation, Constants.ERROR, presentation.getBaseActivity()
                .getString(R.string.base_info_error), description);
    }

    @SuppressLint("ResourceType")
    public MessageDialog showMessage(Presentation presentation, @StringRes int title, @StringRes int description) {
        return showMessage(presentation, Constants.SUCCESS,
                           title > 0 ? presentation.getBaseActivity().getString(title) : null,
                           description > 0 ? presentation.getBaseActivity().getString(description) : null);
    }


    //endregion

    @SuppressLint("ResourceType")
    public MessageDialog showMessage(Presentation presentation, @StringRes int title, String description) {
        return showMessage(presentation, Constants.SUCCESS,
                title > 0 ? presentation.getBaseActivity().getString(title) : presentation.getBaseActivity()
                        .getString(R.string.base_info_success), description);
    }

    @SuppressLint("ResourceType")
    public MessageDialog showError(Presentation presentation, @StringRes int title, String description) {
        return showMessage(presentation, Constants.ERROR,
                title > 0 ? presentation.getBaseActivity().getString(title) : presentation.getBaseActivity()
                        .getString(R.string.base_info_error), description);
    }

    @SuppressWarnings("ConstantConditions")
    public MessageDialog showMessage(Presentation presentation, final int messageType, final String title, final String description) {
        if (messageDialog == null || !messageDialog.isShowing()) {
            if (messageDialog != null) messageDialog.dismiss();
            messageDialog = MessageDialog.newInstance(messageType,title, description);
            messageDialog.show(presentation.getSupportFragmentManager());
        } else {
            messageDialog.setTitle(title);
            messageDialog.setDescription(description);
        }
        return messageDialog;
    }

    public void dismissMessage() {
        dismissDialog(messageDialog);
        messageDialog = null;
    }

    //==============================================================================================
    // Common
    //==============================================================================================
    private void dismissDialog(@Nullable DialogFragment dialogFragment) {
        if (dialogFragment == null) return;
        try {
            dialogFragment.dismissAllowingStateLoss();
        } catch (Exception ex) {
            Log.e(TAG, "dismissProgress()", ex);
        }
    }


    public void showRetryDialog(Presentation presentation,
                                @StringRes int title,
                                @StringRes int description,
                                @Nullable NetworkListener networkListener) {
        @SuppressLint("ResourceType") RetryDialog dialog = RetryDialog.newInstance(title > 0 ? presentation.getBaseActivity().getString(title) : null,
                description > 0 ? presentation.getBaseActivity().getString(description) : null);
        dialog.show(presentation.getSupportFragmentManager());
        dialog.setRetryListener(networkListener);

    }
}
