package com.mvparchiticture.ui.common.base.dialog;

import android.os.Build.VERSION;
import android.os.Build.VERSION_CODES;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;

import com.mvparchiticture.ui.AppBaseDialogFragment;
import com.mvparchiticture.R;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;

/**
 * @author Created by artem on 09.01.2017.
 */

public class ProgressDialog extends AppBaseDialogFragment {

    private static final String KEY_DESCRIPTION = "KEY.DESCRIPTION";
    private TextView progressTxt;
    private String description;

    public static ProgressDialog newInstance(String description) {
        ProgressDialog fragment = new ProgressDialog();
        Bundle args = new Bundle();
        args.putString(KEY_DESCRIPTION, description);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        description = getArguments().getString(KEY_DESCRIPTION);
    }

    public void onBaseDialogSize(Window window) {
        window.setLayout(MATCH_PARENT, MATCH_PARENT);
    }

    @Override
    public void onBaseDialogBackground(Window window) {
        window.setBackgroundDrawable(ContextCompat.getDrawable(getContext(), R.color.dialog_progress_background));
        if (VERSION.SDK_INT >= VERSION_CODES.KITKAT) {
            window.setFlags(LayoutParams.FLAG_TRANSLUCENT_STATUS, LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
    }

    @Override
    public void onBaseDialogAnim(Window window) {
        window.getAttributes().windowAnimations = R.style.DialogAnimationAlphaFast;
    }

    @Override
    public int onInflateLayout() {
        return R.layout.base_dialog_progress;
    }

    /*@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.base_dialog_progress, container, false);

        return rootView;
    }*/

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        progressTxt = (TextView) view.findViewById(R.id.progress_txt);
        progressTxt.setText(description);
    }

    public void setDescription(String description) {
        progressTxt.setText(description);
    }



}
