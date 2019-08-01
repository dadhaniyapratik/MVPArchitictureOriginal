package com.mvparchiticture.ui.common.widgets

import android.content.Context
import android.os.Build.VERSION
import android.os.Build.VERSION_CODES
import android.support.design.widget.AppBarLayout
import android.util.AttributeSet
import com.artemkopan.utils.ExtraUtils

/**
 * Created by Artem Kopan for MyMoodAndMe
 * 15.03.17
 */
class FitAppBarLayout(context: Context?, attrs: AttributeSet) : AppBarLayout(context, attrs) {

    init {
        if (VERSION.SDK_INT >= VERSION_CODES.KITKAT)
            setPadding(paddingLeft, paddingTop + ExtraUtils.getStatusBarHeight(context), paddingRight, paddingBottom)
    }

}