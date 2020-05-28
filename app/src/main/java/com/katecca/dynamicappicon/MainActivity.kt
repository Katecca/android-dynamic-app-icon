package com.katecca.dynamicappicon

import android.content.ComponentName
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener{
            packageManager?.setComponentEnabledSetting(
                    ComponentName(applicationContext.packageName, applicationContext.packageName + ".MainActivityAlias1"),
                    PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP
            )

            packageManager?.setComponentEnabledSetting(
                    ComponentName(applicationContext.packageName, applicationContext.packageName + ".MainActivityAlias2"),
                    PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP
            )
        }

        button2.setOnClickListener{
            packageManager?.setComponentEnabledSetting(
                    ComponentName(applicationContext.packageName, applicationContext.packageName + ".MainActivityAlias1"),
                    PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP
            )

            packageManager?.setComponentEnabledSetting(
                    ComponentName(applicationContext.packageName, applicationContext.packageName + ".MainActivityAlias2"),
                    PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP
            )
        }
    }
}