package com.example.discover

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.browser.trusted.TrustedWebActivityIntentBuilder
import com.google.androidbrowserhelper.trusted.TwaLauncher


class MainActivity : AppCompatActivity() {

    private val url: String = "https://discoveriitbbs.herokuapp.com/"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
       /* val builder:CustomTabsIntent.Builder = CustomTabsIntent.Builder()
        val customTabsIntent = builder.build()
        customTabsIntent.launchUrl(this, Uri.parse(url))*/
      val SPLASH_TIME_OUT:Long = 3000 // 1 sec
        val builder = TrustedWebActivityIntentBuilder(Uri.parse(url))
            .setNavigationBarColor(Color.RED) // Use the builder to customise.
            .setToolbarColor(Color.BLUE)
        Handler().postDelayed({
            // This method will be executed once the timer is over
            // Start your app main activity

            val launcher = TwaLauncher(this)
            launcher.launch(Uri.parse(url))

            // close this activity
            finish()
        }, SPLASH_TIME_OUT)



    }
    

    // if you press Back button this code will work

    }

