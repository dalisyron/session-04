package com.workshop.sample.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.workshop.sample.R

class CountriesAdapter(val items: List<Country>) : RecyclerView.Adapter<CountryViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CountryViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.item_country_list_item, p0, false)
        return CountryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(p0: CountryViewHolder, p1: Int) {
        val viewHolder = p0
        viewHolder.nameTextView.text = items[p1].name
    }

}