package net.fornwall.fontchanger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var view = CustomView(this)
        view.setBackgroundColor(0x00FF00)
        setContentView(view)
    }
}
