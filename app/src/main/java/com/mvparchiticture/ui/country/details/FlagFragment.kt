package com.mvparchiticture.ui.country.details

import android.annotation.SuppressLint
import android.graphics.drawable.PictureDrawable
import android.net.Uri
import android.os.Bundle
import android.provider.SyncStateContract
import android.view.View
import com.ahmadrosid.svgloader.SvgLoader
import com.bumptech.glide.Glide
import com.mvparchiticture.R
import com.mvparchiticture.data.entity.CountryItem
import com.mvparchiticture.ui.AppBaseFragment
import com.mvparchiticture.ui.common.base.mvp.presenter.BasePresenter
import com.mvparchiticture.ui.common.base.mvp.presenter.lifecycle.PresenterProvider
import com.mvparchiticture.ui.common.base.mvp.presenter.lifecycle.PresentersProvider
import com.mvparchiticture.ui.common.base.mvp.view.BaseView
import com.mvparchiticture.ui.country.CountryPresenter
import com.mvparchiticture.ui.country.CountryView
import com.mvparchiticture.util.Constants
import kotlinx.android.synthetic.main.fragment_country.*
import java.io.InputStream
import com.bumptech.glide.load.resource.file.FileToStreamDecoder
import com.bumptech.glide.load.model.StreamEncoder

@SuppressLint("CheckResult")
class FlagFragment : AppBaseFragment<CountryPresenter, CountryView>(), CountryView {

    var countryItem = CountryItem()

    override fun onCountryReceived(countryItem: List<CountryItem>) {
    }

    companion object {
        @JvmStatic
        fun newInstance(countryItem: CountryItem) = FlagFragment().apply {
            arguments = Bundle().apply {
                putParcelable(Constants.IntentFilter.DATA, countryItem)
            }
        }
    }

    override fun onInflateLayout() = R.layout.fragment_country

    override fun onHiddenChanged(hidden: Boolean) {
        super.onHiddenChanged(hidden)
        (context as DetailsActivity).manageToolbar(true, true, countryItem.name, true, false, "", false)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setPresenter(PresentersProvider.of(
                this,
                object : PresenterProvider.Factory {
                    override fun <T : BasePresenter<out BaseView>> create(modelClass: Class<T>): T {
                        return CountryPresenter() as T
                    }
                }
        ).get(CountryPresenter::class.java), true)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setPresenter(PresentersProvider.of(this, object : PresenterProvider.Factory {
            override fun <T : BasePresenter<out BaseView>> create(modelClass: Class<T>): T {
                return CountryPresenter() as T
            }
        }).get(CountryPresenter::class.java), true)
        countryItem = arguments?.getParcelable(Constants.IntentFilter.DATA)!!
        (context as DetailsActivity).manageToolbar(true, true, countryItem.name, true, false, "", false)
//        ivFlag.setImageURI(countryItem.flag)
//        Glide.with(this)
//                .load(countryItem.flag)
//                .into(ivFlag)


        SvgLoader.pluck()
                .with(activity)
                .setPlaceHolder(R.mipmap.ic_launcher, R.mipmap.ic_launcher)
                .load(countryItem.flag, ivFlag)
//
//        RxViewClick.create(llBuildVehicle_fHome).subscribe {
//            BuildVehicleActivity.route(false).start(this)
    }


}