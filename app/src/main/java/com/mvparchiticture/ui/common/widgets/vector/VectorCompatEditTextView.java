package com.mvparchiticture.ui.common.widgets.vector;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

import com.mvparchiticture.ui.common.widgets.common.ErrorEditText;


/**
 * Created by Artem Kopan for jabrool
 * 30.12.16
 */

public class VectorCompatEditTextView extends AppCompatEditText {

    public VectorCompatEditTextView(Context context) {
        super(context);
    }

    public VectorCompatEditTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public VectorCompatEditTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        VectorCompatViewHelper.loadFromAttributes(this, attrs);
    }
}
