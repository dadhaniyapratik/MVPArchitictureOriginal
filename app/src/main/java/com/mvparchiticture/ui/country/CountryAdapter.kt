package com.mvparchiticture.ui.country

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.text.TextUtils
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.Toast
import com.artemkopan.utils.ViewUtils
import com.artemkopan.utils.rx.RxViewsClick
import com.mvparchiticture.R
import com.mvparchiticture.data.entity.CountryItem
import com.mvparchiticture.ui.common.widgets.recycler.adapter.RecyclerBaseAdapter
import com.mvparchiticture.ui.common.widgets.recycler.adapter.RecyclerListAdapter
import com.mvparchiticture.ui.common.widgets.recycler.holder.BaseHolder
import com.mvparchiticture.ui.common.widgets.recycler.holder.SimpleHolder
import com.mvparchiticture.ui.country.details.DetailsActivity
import kotlinx.android.synthetic.main.item_country.view.*
import java.util.*
import kotlin.collections.ArrayList
import java.nio.file.Files.size

class CountryAdapter(val countryItem  : MutableList<CountryItem> ,  var context: Context) : RecyclerListAdapter<CountryItem, RecyclerView.ViewHolder>(),Filterable {
    private var conytrySearchList: List<CountryItem>? = null

    init {
        this.conytrySearchList = countryItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val holder: APOHolder

        return when (viewType) {
            RecyclerBaseAdapter.FOOTER -> SimpleHolder<Any>(ViewUtils.inflateView(parent, R.layout.item_progress))
            else -> {
                holder = APOHolder(ViewUtils.inflateView(parent, R.layout.item_country))

                RxViewsClick.create(holder.itemView, holder.itemView.tvname ).subscribe {
                    callOnItemClick(holder, it)

                    conytrySearchList?.get(holder.adapterPosition)?.let { it1 -> DetailsActivity.route(it1).start(context) }
                    Toast.makeText(context, "" +  conytrySearchList?.get(holder.adapterPosition)!!.name, Toast.LENGTH_SHORT).show()
                }
                holder
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, model: CountryItem?, position: Int) {
        (holder as? APOHolder)?.bind(model, position)
    }

    inner class APOHolder(itemView: View) : BaseHolder<CountryItem>(itemView) {
        override fun clear() {
        }

        override fun bind(context: Context?, item: CountryItem?, position: Int) {
            itemView.tvname.text = conytrySearchList!![position].name
        }
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(charSequence: CharSequence): Filter.FilterResults {
                val charString = charSequence.toString()
                if (charString.isEmpty()) {
                    conytrySearchList = countryItem
                } else {
                    val filteredList = ArrayList<CountryItem>()
                    for (row in countryItem) {
                        if (row.name!!.toLowerCase().contains(charString.toLowerCase()) || row.name!!.contains(charSequence)) {
                            filteredList.add(row)
                        }
                    }
                    conytrySearchList = filteredList
                }
                val filterResults = Filter.FilterResults()
                filterResults.values = conytrySearchList
                return filterResults
            }
            override fun publishResults(charSequence: CharSequence, filterResults: Filter.FilterResults) {
                conytrySearchList = filterResults.values as ArrayList<CountryItem>
                (context as CountryActivity).handelDisplayView(conytrySearchList as ArrayList<CountryItem>)
                notifyDataSetChanged()
            }
        }
    }

    override fun getItemCount(): Int {
        return conytrySearchList!!.size
    }
}