package com.mvparchiticture.ui.common.widgets

import android.content.Context
import android.os.Build.VERSION
import android.os.Build.VERSION_CODES
import android.support.design.widget.CoordinatorLayout
import android.util.AttributeSet
import com.artemkopan.utils.ExtraUtils

/**
 * Created by Artem Kopan for MyMoodAndMe
 * 24.03.17
 */

class FitCoordinatorLayout @JvmOverloads constructor(context: Context?, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
    : CoordinatorLayout(context!!, attrs, defStyleAttr) {

    init {
        if (VERSION.SDK_INT >= VERSION_CODES.KITKAT)
            setPadding(paddingLeft, paddingTop + ExtraUtils.getStatusBarHeight(context), paddingRight, paddingBottom)
    }

}