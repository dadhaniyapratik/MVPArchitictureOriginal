package com.mvparchiticture.ui.common.base.dialog;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;

import com.artemkopan.utils.StringUtils;
import com.mvparchiticture.ui.AppBaseDialogFragment;
import com.mvparchiticture.R;
import com.mvparchiticture.ui.common.base.mvp.dialog.BaseDialogFragment;
import com.mvparchiticture.ui.common.widgets.fonts.FontButton;
import com.mvparchiticture.ui.common.widgets.fonts.FontTextView;


/**
 * Created by Artem Kopan for BaseProject
 * 09.01.2017
 */

public class MessageDialog extends AppBaseDialogFragment {

    private static final String KEY_TITLE = "KEY.TITLE";
    private static final String KEY_DESCRIPTION = "KEY.DESCRIPTION";
    private static final String KEY_MESSAGE_TYPE = "KEY.MESSAGE";

    private FontTextView titleTxt;
    private FontTextView descriptionTxt;
    private ImageView ivMessageType;
    public FontButton btnOkay, btnCancel;

    private int messageType;
    private String title;
    private String description;
    private boolean showNegativeButton = false;


    private String btnOkTitle = "";
    private String btnCancelTitle = "";

    private View.OnClickListener btnOkListner, btnCancelListner;

    public static MessageDialog newInstance(int messageType, String title, String description) {
        MessageDialog fragment = new MessageDialog();
        Bundle args = new Bundle();
        args.putInt(KEY_MESSAGE_TYPE, messageType);
        args.putString(KEY_TITLE, title);
        args.putString(KEY_DESCRIPTION, description);
        fragment.setArguments(args);
        return fragment;
    }

  /*  @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = new Dialog(getContext(), getTheme());

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;

        dialog.getWindow().setAttributes(lp);
        return dialog;

        // return new BottomSheetDialog(getContext(), getTheme());
    }*/

    /*@Override
    public void onBaseDialogBackground(Window window) {
        super.onBaseDialogBackground(window);
        if (VERSION.SDK_INT >= VERSION_CODES.KITKAT) {
            window.addFlags(LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
    }*/

    @Override
    public void onStart() {
        super.onStart();
        //getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#11000000")));
        //  getDialog().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(BaseDialogFragment.STYLE_NO_TITLE, R.style.DialogStyle);
        title = getArguments().getString(KEY_TITLE);
        description = getArguments().getString(KEY_DESCRIPTION);
        messageType = getArguments().getInt(KEY_MESSAGE_TYPE);

        //window.attributes.windowAnimations =
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        titleTxt = view.findViewById(R.id.dConfirmationDialog_ivDialogTitle);
        descriptionTxt = view.findViewById(R.id.dConfirmationDialog_ivDialogDetails);
        ivMessageType = view.findViewById(R.id.dConfirmationDialog_ivDialogImage);
        btnOkay = view.findViewById(R.id.dConfirmationDialog_btnPositive);
        btnCancel = view.findViewById(R.id.dConfirmationDialog_btnNegative);
        setCancelable(false);
        setTitle(title);
        setDescription(description);
        if (btnOkListner != null) {
            btnOkay.setOnClickListener(btnOkListner);
        } else {
            btnOkay.setOnClickListener(v -> {
                dismiss();
            });
        }
        if (btnCancelListner != null) {
            btnCancel.setOnClickListener(btnCancelListner);
        } else {
            btnCancel.setOnClickListener(v -> {
                dismiss();
            });
        }

        if (!StringUtils.isEmpty(btnOkTitle)) {
            btnOkay.setText(btnOkTitle);
        }
        if (!StringUtils.isEmpty(btnCancelTitle)) {
            btnCancel.setText(btnCancelTitle);
        }

        btnCancel.setVisibility(showNegativeButton ? View.VISIBLE : View.GONE);


    }

    public void showPositiveButton(String lbl, View.OnClickListener clickListener) {
        btnOkTitle = lbl;
        if (clickListener != null)
            btnOkListner = clickListener;
    }

    public void showNegativeButton(boolean show, String lbl, View.OnClickListener clickListener) {
        showNegativeButton = show;
        btnCancelTitle = lbl;
        if (clickListener != null)
            btnCancelListner = clickListener;
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
        descriptionTxt.setText(description);
    }

    @Override
    public int onInflateLayout() {
        return R.layout.base_dialog_message;
    }
}
