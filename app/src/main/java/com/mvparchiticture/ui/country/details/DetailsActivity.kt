package com.mvparchiticture.ui.country.details

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import com.artemkopan.utils.router.ActivityBuilder
import com.artemkopan.utils.router.Router
import com.artemkopan.utils.rx.RxViewsClick
import com.mvparchiticture.R
import com.mvparchiticture.data.entity.CountryItem
import com.mvparchiticture.ui.AppBaseActivity
import com.mvparchiticture.ui.common.base.mvp.presenter.BasePresenter
import com.mvparchiticture.ui.common.base.mvp.presenter.lifecycle.PresenterProvider
import com.mvparchiticture.ui.common.base.mvp.presenter.lifecycle.PresentersProvider
import com.mvparchiticture.ui.common.base.mvp.view.BaseView
import com.mvparchiticture.util.Constants
import kotlinx.android.synthetic.main.activity_details.*

@SuppressLint("CheckResult")
class DetailsActivity : AppBaseActivity<DetailsPresenter, DetailsView>(), DetailsView {

    var countryItem = CountryItem()

    companion object {
        fun route(countryItem: CountryItem): ActivityBuilder<*> {
            return Router.activity(DetailsActivity::class.java).putExtra(Constants.IntentFilter.DATA, countryItem)
        }
    }

    override fun onInflateLayout() = R.layout.activity_details



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        onToolbarInit(R.id.toolbar)
        setPresenter(PresentersProvider.of(this, object : PresenterProvider.Factory {
            override fun <T : BasePresenter<out BaseView>> create(modelClass: Class<T>): T {
                return DetailsPresenter() as T
            }
        }).get(DetailsPresenter::class.java), true)
        countryItem = intent.getParcelableExtra(Constants.IntentFilter.DATA)
        loadFragment(FlagFragment.newInstance(countryItem))

        RxViewsClick.create(btnflag, btnBorder).subscribe {
            when (it.id) {
                R.id.btnflag -> {
                    loadFragment(FlagFragment.newInstance(countryItem))
                }

                R.id.btnBorder -> {
                    loadFragment(NameFragment.newInstance(countryItem))
                }
            }
        }
    }


    fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment, fragment::class.java.name).commit()
    }

}