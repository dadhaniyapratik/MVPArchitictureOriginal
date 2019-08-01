package com.mvparchiticture.ui.common.widgets

import android.content.Context
import android.os.Build.VERSION
import android.os.Build.VERSION_CODES
import android.util.AttributeSet
import android.widget.FrameLayout
import com.artemkopan.utils.ExtraUtils

/**
 * Created by Artem Kopan for MyMoodAndMe
 * 06.06.17
 */

class FitFrameLayout @JvmOverloads constructor(context: Context?, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
    : FrameLayout(context, attrs, defStyleAttr) {

    init {
        if (VERSION.SDK_INT >= VERSION_CODES.KITKAT)
            setPadding(paddingLeft, paddingTop + ExtraUtils.getStatusBarHeight(context), paddingRight, paddingBottom)
    }
}