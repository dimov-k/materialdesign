package ru.mrroot.materialdesign.ui.pictures.view_pager

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import ru.mrroot.materialdesign.R
import ru.mrroot.materialdesign.ui.pictures.BOTTOM_SHEET_CONTENT
import ru.mrroot.materialdesign.ui.pictures.BOTTOM_SHEET_HEADER
import ru.mrroot.materialdesign.ui.settings.SETTINGS_SHARED_PREFERENCES
import ru.mrroot.materialdesign.ui.settings.THEME_RES_ID

class CollapsingToolbarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(
            getSharedPreferences(SETTINGS_SHARED_PREFERENCES, MODE_PRIVATE)
                .getInt(THEME_RES_ID, R.style.DefaultTheme)
        )
        setContentView(R.layout.collapsing_toolbar_activity)
        setSupportActionBar(findViewById(R.id.toolbar))
        findViewById<CollapsingToolbarLayout>(R.id.toolbar_layout).title =
            intent.getStringExtra(BOTTOM_SHEET_HEADER)
        findViewById<TextView>(R.id.collapsing_toolbar_content_textview).text =
            intent.getStringExtra(BOTTOM_SHEET_CONTENT)
        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}