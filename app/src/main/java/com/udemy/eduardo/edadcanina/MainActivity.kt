package com.udemy.eduardo.edadcanina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ageEdit : EditText = findViewById<EditText>(R.id.age_edit)
        val resultText : TextView = findViewById<TextView>(R.id.result_text)
        val button : Button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            val ageString : String = ageEdit.text.toString()
            val ageInt : Int = ageString.toInt()
            var result : Int = ageInt * 7
            resultText.text = "Tu edad caninca es de ${result} años"
        }
    }
}