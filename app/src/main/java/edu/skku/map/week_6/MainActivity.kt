package edu.skku.map.week_6

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    companion object{
        const val EXT_NAME = "edie"
        const val EXT_SID = "12321"
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName = findViewById<EditText>(R.id.editTextName)
        val editTextAge = findViewById<EditText>(R.id.editTextAge)


        val btnNewActivity = findViewById<Button>(R.id.button_activity)
        btnNewActivity.setOnClickListener {

            val name = editTextName.text.toString()
            val age = editTextAge.text.toString().toInt()
            val intent = Intent(this, MainActivity2::class.java).apply{

                putExtra(EXT_NAME, name)
                putExtra(EXT_SID, age)
            }
            startActivity(intent)
        }
    }
    override fun onResume(){
        super.onResume()
        val name = findViewById<EditText>(R.id.editTextName)
        name.text.clear()
        val age= findViewById<EditText>(R.id.editTextAge)
        age.text.clear()

    }

}