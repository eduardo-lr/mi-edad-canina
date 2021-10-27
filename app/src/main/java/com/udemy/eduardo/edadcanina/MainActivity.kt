package com.udemy.eduardo.edadcanina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.udemy.eduardo.edadcanina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            val ageString : String = binding.ageEdit.text.toString()
            try {
                val ageInt : Int = ageString.toInt()
                val result : Int = ageInt * 7
                binding.resultText.text = getString(R.string.text_result, result)
            } catch (nfe: NumberFormatException) {
                Toast.makeText(this, R.string.you_must_insert_your_age, Toast.LENGTH_SHORT).show()
            }
        }
    }
}