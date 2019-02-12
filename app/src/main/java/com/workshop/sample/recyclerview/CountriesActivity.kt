package com.workshop.sample.recyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.workshop.sample.R

class CountriesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_countries)

        val countries = listOf(
            Country("Iran"),
            Country("A"),
            Country("B"),
            Country("C"),
            Country("D"),
            Country("E"),
            Country("F"),
            Country("Iran"),
            Country("A"),
            Country("B"),
            Country("C"),
            Country("D"),
            Country("E"),
            Country("F")
        )

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = CountriesAdapter(countries)
    }
}
