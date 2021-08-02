package ru.mrroot.materialdesign.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.mrroot.materialdesign.R
import ru.mrroot.materialdesign.ui.picture.PictureOfTheDayFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, PictureOfTheDayFragment.newInstance())
                .commitAllowingStateLoss()
        }
    }
}
