package com.mvparchiticture.ui.common.widgets

import android.animation.AnimatorInflater
import android.content.Context
import android.os.Build.VERSION
import android.os.Build.VERSION_CODES
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet
import com.mvparchiticture.R

/**
 * Created by Artem Kopan for workwell
 * 22.06.17
 */


class ArrowButton @JvmOverloads constructor(context: Context?, attrs: AttributeSet? = null, defStyle: Int = 0)
    : AppCompatImageView(context, attrs, defStyle) {


    companion object {
        private const val ALPHA_DISABLE = 0.5f
        private const val ALPHA_ENABLE = 1f
    }

    init {
        if (VERSION.SDK_INT >= VERSION_CODES.LOLLIPOP) {
            stateListAnimator = AnimatorInflater.loadStateListAnimator(context, R.animator.shadow_state_list)
        }
    }

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        if (enabled) {
            alpha = ALPHA_ENABLE
        } else {
            alpha = ALPHA_DISABLE
        }
    }


}