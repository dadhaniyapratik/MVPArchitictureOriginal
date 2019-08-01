package com.mvparchiticture.ui.common.base.mvp.view

interface BaseListView<M> : BaseView {

    fun setItems(items: List<M>, tag: Any?)

    fun insertItems(items: List<M>, positionStart: Int, itemCount: Int, tag: Any?)

    fun showEmptyList(tag: Any?)

    fun togglePagination(isEnable: Boolean, tag: Any?)

}
