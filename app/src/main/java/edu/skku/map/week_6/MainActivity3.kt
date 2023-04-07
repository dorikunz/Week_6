package edu.skku.map.week_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val name = intent.getStringExtra(MainActivity.EXT_NAME)
        val sid = intent.getIntExtra(MainActivity.EXT_SID, -1)

        Toast.makeText(
            applicationContext,
            "Welcome, ${name}(${sid} years old)!",
            Toast.LENGTH_SHORT
        ).show()
    }
}