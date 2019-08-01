package com.mvparchiticture.ui.common.base.dialog;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.mvparchiticture.ui.AppBaseDialogFragment;
import com.mvparchiticture.R;
import com.mvparchiticture.ui.common.base.listeners.NetworkListener;
import com.mvparchiticture.ui.common.base.mvp.dialog.BaseDialogFragment;
import com.mvparchiticture.ui.common.widgets.fonts.FontButton;

/**
 * Created by umshah on 3/13/2018.
 */

public class RetryDialog extends AppBaseDialogFragment{

    private static final String KEY_TITLE = "KEY.TITLE";
    private static final String KEY_DESCRIPTION = "KEY.DESCRIPTION";

    private TextView titleTxt, descriptionTxt;
    private String title, description;
    private FontButton fontButton;

    private NetworkListener onNetworkListener;

    public static RetryDialog newInstance(String title, String description) {
        RetryDialog fragment = new RetryDialog();
        Bundle args = new Bundle();
        args.putString(KEY_TITLE, title);
        args.putString(KEY_DESCRIPTION, description);
        fragment.setArguments(args);
        return fragment;
    }

  /*  @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
       *//* BottomSheetDialog dialog = new BottomSheetDialog(getContext(), getTheme());
        return dialog;*//*
    }

    @Override
    public void onBaseDialogBackground(Window window) {
        super.onBaseDialogBackground(window);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
    }*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(BaseDialogFragment.STYLE_NO_TITLE, R.style.DialogStyle);
        title = getArguments().getString(KEY_TITLE);
        description = getArguments().getString(KEY_DESCRIPTION);

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        titleTxt = view.findViewById(R.id.title_txt);
        descriptionTxt = view.findViewById(R.id.description_txt);
        // fontButton = rootView.findViewById(R.id.btnOkay);
        setTitle(title);
        setDescription(description);
        setCancelable(false);
        fontButton.setOnClickListener(v -> {
            if (onNetworkListener != null) {
                RetryDialog.this.dismiss();
                onNetworkListener.onRetry();
            }
        });
    }

    public void setTitle(String title) {
        if (TextUtils.isEmpty(title)) {
            titleTxt.setVisibility(View.GONE);
        } else {
            titleTxt.setText(title);
            titleTxt.setVisibility(View.VISIBLE);
        }
    }

    public void setDescription(String description) {
        if (TextUtils.isEmpty(description)) {
            descriptionTxt.setVisibility(View.GONE);
        } else {
            descriptionTxt.setText(description);
            descriptionTxt.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int onInflateLayout() {
        return R.layout.base_dialog_retry;
    }

    public void setRetryListener(NetworkListener onNetworkListener) {
        this.onNetworkListener = onNetworkListener;
    }
}