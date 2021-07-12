package ru.mrroot.materialdesign.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.mrroot.materialdesign.R
import ru.mrroot.materialdesign.ui.pictures.PictureOfTheDayFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, PictureOfTheDayFragment.newInstance())
                .commitNow()
        }
    }
}