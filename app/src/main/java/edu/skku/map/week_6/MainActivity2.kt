package edu.skku.map.week_6

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val name = intent.getStringExtra(MainActivity.EXT_NAME)
        val age = intent.getIntExtra(MainActivity.EXT_SID, -1)


        val message = findViewById<TextView>(R.id.showMessage)
        message.text = "Welcome, ${name}(${age})!"

        val yesButton = findViewById<Button>(R.id.yesButton)
        yesButton.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java).apply{
                putExtra(MainActivity.EXT_NAME, name)
                putExtra(MainActivity.EXT_SID, age)
            }
            startActivity(intent)
        }

        val noButton = findViewById<Button>(R.id.noButton)
        noButton.setOnClickListener{
            finish()
        }
    }


}