package com.mvparchiticture.ui.common.base.extensions

import android.graphics.*
import android.support.annotation.DrawableRes
import android.support.annotation.Px
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.Transformation
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.DiskCacheStrategy.RESULT
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.drawable.GlideDrawable
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.mvparchiticture.BuildConfig
import com.mvparchiticture.R
import com.mvparchiticture.ui.common.base.util.glide.CropCircleTransformation
import com.mvparchiticture.ui.common.base.util.glide.RoundedCornersTransformation
import timber.log.Timber
import java.lang.Exception

/**
 * Created by Artem Kopan for MyMoodAndMe
 * 06.03.17
 */

const val NO_OVERRIDE = -1



fun ImageView.loadCircle(uri: Any?, animate: Boolean = false) {
    load(uri,
            errorDrawable = R.mipmap.ic_launcher,
            placeholderDrawable =  R.mipmap.ic_launcher,
            centerCrop = false,
            animate = animate,
            transformations = * arrayOf(CropCircleTransformation(context)))
}

fun ImageView.loadRounded(uri: Any?, radius: Int, margin: Int = 0, animate: Boolean = false) {
    load(uri,
            errorDrawable = R.mipmap.ic_launcher,
            placeholderDrawable =  R.mipmap.ic_launcher,
            centerCrop = true,
            animate = animate,
            transformations = * arrayOf(RoundedCornersTransformation(context, radius, margin)))
}

fun ImageView.load(uri: Any?,
                   @Px width: Int = NO_OVERRIDE,
                   @Px height: Int = NO_OVERRIDE,
                   @DrawableRes errorDrawable: Int = R.drawable.ic_failure,
                   @DrawableRes placeholderDrawable: Int = R.mipmap.ic_launcher,
                   centerCrop: Boolean = true,
                   animate: Boolean = false,
                   diskCacheStrategy: DiskCacheStrategy = RESULT,
                   vararg transformations: Transformation<Bitmap> = emptyArray()) {

    val request = Glide.with(context).load(uri)

    request.error(errorDrawable)
    request.placeholder(placeholderDrawable)

    if (centerCrop && transformations.isEmpty()) {
        request.centerCrop()
    } else if (centerCrop && transformations.isNotEmpty()) {
        request.bitmapTransform(*arrayOf(CenterCrop(context), *transformations))
    } else if (transformations.isNotEmpty()) {
        request.bitmapTransform(*transformations)
    }

    request.diskCacheStrategy(diskCacheStrategy)

    if (!animate) request.dontAnimate()

    if (width != NO_OVERRIDE && height != NO_OVERRIDE) request.override(width, height)

    if (BuildConfig.DEBUG) {
        request.listener(object : RequestListener<Any?, GlideDrawable> {
            override fun onException(e: Exception?, model: Any?, target: Target<GlideDrawable>?, isFirstResource: Boolean): Boolean {
                Timber.d("onException() called with: e = [$e], teamModel = [$model], target = [$target], isFirstResource = [$isFirstResource]")
                return false
            }

            override fun onResourceReady(resource: GlideDrawable?, model: Any?, target: Target<GlideDrawable>?, isFromMemoryCache: Boolean, isFirstResource: Boolean): Boolean {
                Timber.d("onResourceReady() called with: resource = [$resource], teamModel = [$model], target = [$target], isFromMemoryCache = [$isFromMemoryCache], isFirstResource = [$isFirstResource]")
                return false
            }

        })
    }

    request.into(this)
}
    fun Bitmap.loadCircleBitmap() : Bitmap{
        val out = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(out)

        val color = 0xff424242
        val paint = Paint()
        val rect = Rect(0, 0, this.width, this.height)

        paint.isAntiAlias = true
        canvas.drawARGB(0,0,0,0)
        paint.color = color.toInt()
        canvas.drawCircle((this.width / 2).toFloat(), (this.height /2).toFloat(), (this.width /2).toFloat(),paint)
        paint.xfermode = PorterDuffXfermode(PorterDuff.Mode.SRC_IN)
        canvas.drawBitmap(this,rect,rect,paint)
        return out
    }
