package ru.mrroot.materialdesign.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.mrroot.materialdesign.R
import ru.mrroot.materialdesign.ui.pictures.PictureOfTheDayFragment
import ru.mrroot.materialdesign.ui.settings.SETTINGS_SHARED_PREFERENCES
import ru.mrroot.materialdesign.ui.settings.THEME_RES_ID

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(
            getSharedPreferences(SETTINGS_SHARED_PREFERENCES, MODE_PRIVATE)
                .getInt(THEME_RES_ID, R.style.DefaultTheme)
        )
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, PictureOfTheDayFragment.newInstance())
                .commitNowAllowingStateLoss()
        }
    }
}