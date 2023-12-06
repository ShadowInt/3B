package com.coder1.threeb

import android.content.Context
import android.content.SharedPreferences

class SharedPreferencesManager(context: Context) {
    companion object {
        const val PREFERENCES_NAME = "sergey"
        const val DATA = "data"
    }

    private val sharedPreferences: SharedPreferences = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)

    fun updateData(data: String) {
        val editor = sharedPreferences.edit()
        editor.putString(DATA, data)
        editor.apply()
    }

    fun getData(): String? {
        return sharedPreferences.getString(DATA, null)
    }
}