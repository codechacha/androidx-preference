package com.codechacha.preference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sps = PreferenceManager.getDefaultSharedPreferences(this)
        val addShortcut = sps.getBoolean("key_add_shortcut", false)
        val screenOn = sps.getBoolean("key_switch_on", false)
        val editName = sps.getString("key_edit_name", "")
    }
}
