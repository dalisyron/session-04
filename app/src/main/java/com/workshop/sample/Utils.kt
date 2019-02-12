package com.workshop.sample

import android.content.Context

fun get(context: Context) {
    val text = context.resources.openRawResource(R.raw.countries)
        .bufferedReader()
        .use {
            it.readText()
        }
    println(text)
}