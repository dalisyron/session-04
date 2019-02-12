package com.workshop.sample.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.workshop.sample.R

class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val nameTextView: TextView = itemView.findViewById(R.id.name)
    val capitalTextView: TextView = itemView.findViewById(R.id.capital)

}