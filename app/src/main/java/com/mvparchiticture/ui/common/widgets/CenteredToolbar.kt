package com.mvparchiticture.ui.common.widgets

import android.content.Context
import android.graphics.Typeface
import android.os.Build.VERSION
import android.os.Build.VERSION_CODES
import android.support.v4.content.res.ResourcesCompat
import android.support.v7.appcompat.R.attr
import android.support.v7.appcompat.R.attr.titleTextAppearance
import android.support.v7.widget.AppCompatImageView
import android.support.v7.widget.AppCompatTextView
import android.support.v7.widget.Toolbar
import android.text.TextUtils.TruncateAt.END
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import android.widget.TextView
import com.mvparchiticture.R
import com.mvparchiticture.ui.common.widgets.fonts.FontTextView
import com.mvparchiticture.ui.common.widgets.fonts.FontUtils
import timber.log.Timber


/**
 * Created by Artem Kopan for MyMoodAndMe
 * 17.03.17
 */

class CenteredToolbar @JvmOverloads constructor(context: Context,
                                                attrs: AttributeSet? = null,
                                                defStyleAttr: Int = attr.toolbarStyle)
    : Toolbar(context, attrs, defStyleAttr) {

    private var titleView: AppCompatTextView = AppCompatTextView(context)
    private var titleLogo: AppCompatImageView = AppCompatImageView(context)
    private val titleMargin = context.resources.getDimensionPixelSize(R.dimen.toolbar_title_margin)

    init {
        if (!isInEditMode) {
            val textAppearanceStyleResId: Int
            val a = context.theme?.obtainStyledAttributes(attrs, intArrayOf(titleTextAppearance), defStyleAttr, 0)
            if (a != null) {
                try {
                    textAppearanceStyleResId = a.getResourceId(0, 0)
                } finally {
                    a.recycle()
                }
                if (textAppearanceStyleResId > 0) {
                    if (VERSION.SDK_INT >= VERSION_CODES.M) {
                        titleView.setTextAppearance(textAppearanceStyleResId)
                    } else {
                        @Suppress("DEPRECATION")
                        titleView.setTextAppearance(context, textAppearanceStyleResId)
                    }
                }


                titleView.setTextColor(ResourcesCompat.getColor(resources, R.color.color_363636, null))
                titleView.setSingleLine(true)
                titleView.ellipsize = END
                titleView.typeface = FontUtils.selectTypeface(context, Typeface.BOLD)

                titleLogo.setImageResource(R.mipmap.ic_launcher)

                val params = LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
                params.gravity = Gravity.CENTER
                addView(titleView, params)
                addView(titleLogo, params)
            }
        }
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        super.onLayout(changed, l, t, r, b)
  //      calculateCenterLogoPos(this, titleView)
    }

    private fun calculateCenterLogoPos(toolbar: Toolbar, viewOffset: View) {
        var neededX = toolbar.width / 2 - viewOffset.width / 2

        if (neededX < titleMargin) {
            neededX = titleMargin
        }

        Timber.i("neededX $neededX, currentX ")
        viewOffset.x = neededX.toFloat()
    }

    override fun setTitle(title: CharSequence) {
        if (isInEditMode)
            super.setTitle(title)
        else {
            titleView.visibility = View.VISIBLE
            titleLogo.visibility = View.GONE
            titleView.text = title
        }
    }

    fun setToolbarIcon(drawable: Int){
        titleView.visibility = View.GONE
        titleLogo.visibility = View.VISIBLE
        titleLogo.setImageResource(drawable)
    }

}
