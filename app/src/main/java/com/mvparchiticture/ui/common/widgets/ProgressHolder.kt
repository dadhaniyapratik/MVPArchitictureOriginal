package com.mvparchiticture.ui.common.widgets

import android.content.Context
import android.view.View
import android.view.ViewGroup
import com.artemkopan.utils.ViewUtils
import com.mvparchiticture.R
import com.mvparchiticture.ui.common.widgets.recycler.holder.BaseHolder

/**
 * Created by Artem Kopan for MyMoodAndMe
 * 24.03.17
 */

class ProgressHolder<M>(itemView: View) : BaseHolder<M>(itemView) {

    companion object {
        const val PROGRESS = 18213

        fun <M> create(parent: ViewGroup): ProgressHolder<M> {
            return ProgressHolder(ViewUtils.inflateView(parent, R.layout.item_progress))
        }
    }

    override fun bind(context: Context?, item: M, position: Int) {
    }

    override fun clear() {
    }
}