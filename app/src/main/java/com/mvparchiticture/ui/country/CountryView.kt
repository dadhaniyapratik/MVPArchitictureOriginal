package com.mvparchiticture.ui.country

import com.mvparchiticture.data.entity.CountryItem
import com.mvparchiticture.ui.common.base.mvp.view.BaseView

interface CountryView : BaseView {
    fun onCountryReceived(countryItem: List<CountryItem> )
}