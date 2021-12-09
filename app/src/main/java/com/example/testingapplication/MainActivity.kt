package com.example.testingapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import utils.EmailValidation
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val emailInput = findViewById<EditText>(R.id.editTextEmailAddress)
        val buttonCheck = findViewById<Button>(R.id.button)
        val textStatus = findViewById<TextView>(R.id.textView)

        buttonCheck.setOnClickListener {
            if (EmailValidation.validateEmail(emailInput.text.toString())) {
                textStatus.text = "Email верный"
                startActivity(Intent(this, MainActivity2::class.java))
            } else {
                textStatus.text = "Email введен неверно"
            }
        }
    }
    companion object {
        fun validateEmail(email: String): Boolean {
            val pattern = "^\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*(\\.\\w{2,3})+\$"
            return Pattern.matches(pattern, email)
        }
    }
}