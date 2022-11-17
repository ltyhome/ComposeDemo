package com.android.shopmy

import android.content.Context
import androidx.startup.Initializer

class ShopMyInitializer: Initializer<Unit> {
    override fun create(context: Context) {

    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> = mutableListOf()
}