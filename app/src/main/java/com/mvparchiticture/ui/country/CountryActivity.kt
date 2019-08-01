package com.mvparchiticture.ui.country

import android.os.Bundle
import android.os.Handler
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.SearchView
import android.widget.Toast
import com.artemkopan.utils.router.ActivityBuilder
import com.artemkopan.utils.router.Router
import com.mvparchiticture.R
import com.mvparchiticture.data.entity.CountryItem
import com.mvparchiticture.ui.AppBaseActivity
import com.mvparchiticture.ui.common.base.mvp.presenter.BasePresenter
import com.mvparchiticture.ui.common.base.mvp.presenter.lifecycle.PresenterProvider
import com.mvparchiticture.ui.common.base.mvp.presenter.lifecycle.PresentersProvider
import com.mvparchiticture.ui.common.base.mvp.view.BaseView
import com.mvparchiticture.ui.country.details.DetailsActivity
import com.mvparchiticture.util.Constants
import com.mvparchiticture.util.extensions.gone
import com.mvparchiticture.util.extensions.visible
import kotlinx.android.synthetic.main.activity_country.*
import kotlinx.android.synthetic.main.layout_toolbar.*
import java.util.ArrayList


class CountryActivity : AppBaseActivity<CountryPresenter, CountryView>(), CountryView {
    override fun onRefresh() {
        Toast.makeText(this, "Refresh", Toast.LENGTH_SHORT).show()
        Handler().postDelayed(Runnable {
            swiperefresh.isRefreshing = false
        }, 4000) // Delay in millis

        presenter?.getCountryList()
    }

    private lateinit var countryAdapter: CountryAdapter
    private lateinit var layoutManager: LinearLayoutManager
    private lateinit var countryItemList: List<CountryItem>

    override fun onCountryReceived(countryItem: List<CountryItem>) {
        swiperefresh.isRefreshing = false
        countryItemList = countryItem
        setAdapter(countryItemList)
    }


    companion object {
        fun route(reportId: Int): ActivityBuilder<*> {
            return Router.activity(CountryActivity::class.java).putExtra(Constants.REPORT_NUMBER, reportId)
        }
    }

    override fun onInflateLayout() = R.layout.activity_country


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        onToolbarInit(R.id.toolbar)
        manageToolbar(false,true,resources.getString(R.string.app_name),false,false,"",false)
        setPresenter(PresentersProvider.of(this, object : PresenterProvider.Factory {
            override fun <T : BasePresenter<out BaseView>> create(modelClass: Class<T>): T {
                return CountryPresenter() as T
            }
        }).get(CountryPresenter::class.java), true)
        presenter?.getCountryList()


        etSearch.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {

            }

            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                //                if (charSequence.length() > 0)
                if (countryItemList.isNotEmpty()) {
                    countryAdapter.filter.filter(etSearch.text.toString().trim())
                }
            }

            override fun afterTextChanged(editable: Editable) {

            }
        })
    }

    private fun setAdapter(countryList: List<CountryItem>) {

        if (countryList.isNotEmpty()) {
            countryAdapter = CountryAdapter(countryList as MutableList<CountryItem>, this)
            countryAdapter.setList(countryItemList, true)
            rvCountry.adapter = countryAdapter
            layoutManager = LinearLayoutManager(this@CountryActivity, LinearLayoutManager.VERTICAL, false)
            rvCountry.layoutManager = layoutManager
            rvCountry.isNestedScrollingEnabled = false
            countryAdapter.setOnItemClickListener { view, pos, item, transactionViews ->
                when (view.id) {
                    R.id.tvname -> {
//                        DetailsActivity.route(item).start(this)
//                        Toast.makeText(this, "" + item.name, Toast.LENGTH_SHORT).show()
                    }
                }
            }
            rvCountry.itemAnimator = DefaultItemAnimator()
            rvCountry.visibility = View.VISIBLE
            tvNodata.visibility = View.GONE
        } else {
            rvCountry.visibility = View.GONE
            tvNodata.visibility = View.VISIBLE
        }
    }

    fun handelDisplayView(mArrayInboxDisplay: ArrayList<CountryItem>) {

        if (mArrayInboxDisplay.size > 0) {
            rvCountry.visibility = View.VISIBLE
            tvNodata.visibility = View.GONE
        } else {
            rvCountry.visibility = View.GONE
            tvNodata.visibility = View.VISIBLE
        }

    }





}