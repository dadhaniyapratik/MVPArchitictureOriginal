package com.mvparchiticture.ui.common.widgets.fonts;

import android.content.Context;
import android.util.AttributeSet;

import com.mvparchiticture.ui.common.widgets.vector.VectorCompatEditTextView;

import static java.security.AccessController.getContext;


/**
 * Created by Artem Kopan for MyMoodAndMe
 * 22.03.17
 */

public class FontEditText extends VectorCompatEditTextView {

    public FontEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public FontEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        FontUtils.applyCustomFont(this, getContext(), attrs);
    }
}

