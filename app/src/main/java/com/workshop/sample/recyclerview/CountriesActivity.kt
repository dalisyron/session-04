package com.workshop.sample.recyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.workshop.sample.CountriesDataSource
import com.workshop.sample.R
import org.json.JSONArray

class CountriesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_countries)

        val countriesString = CountriesDataSource.get(this)
        val data = JSONArray(countriesString)

        val countries = ArrayList<Country>()
        for (i in 0 until data.length()) {
            val name = data.getJSONObject(i).getJSONObject("name").getString("official")
            val capital = data.getJSONObject(i).getJSONArray("capital").optString(0) ?: "Unknown"
            val country = Country(name, capital)
            countries.add(country)
        }


        val recyclerview = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = CountriesAdapter(countries)
    }
}
