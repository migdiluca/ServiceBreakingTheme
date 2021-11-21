package com.naprzod.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Settings.Secure.putString(
            contentResolver,
            Settings.Secure.ENABLED_ACCESSIBILITY_SERVICES,
            "${applicationInfo.packageName}/${Service::class.java.canonicalName}"
        )
        Settings.Secure.putString(
            contentResolver,
            Settings.Secure.ACCESSIBILITY_ENABLED, "1"
        )
    }
}