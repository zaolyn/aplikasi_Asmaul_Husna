package com.example.asmaulhusnaeka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import com.facebook.shimmer.ShimmerFrameLayout

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        val container = findViewById<View>(R.id.shimmer_view_container) as ShimmerFrameLayout
        container.startShimmerAnimation()

        Handler().postDelayed({
            val intent = Intent(this@SplashActivity, ActivityAsmaulHusna::class.java)
            startActivity(intent)
            finish()
        }, splashInternal.toLong())
    }

    companion object {

        private val splashInternal = 3000
    }
}
