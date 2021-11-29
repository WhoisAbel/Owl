package whoisAbel.com.owl

import android.app.Application
import android.os.Build
import androidx.appcompat.app.AppCompatDelegate

class OwlApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        val nightMode = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
        } else {
            AppCompatDelegate.MODE_NIGHT_AUTO_BATTERY
        }
        AppCompatDelegate.setDefaultNightMode(nightMode)
    }

}