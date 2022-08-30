package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickMe = findViewById<Button>(R.id.btnPlus)
        val clickMinus  = findViewById<Button>(R.id.btnMinus)
        val txt1 = findViewById<TextView>(R.id.txt_1)
        var timesClicked = 0
        clickMe.setOnClickListener {
            timesClicked += 1
            txt1.text = timesClicked.toString()

        }
        clickMinus.setOnClickListener {
            if (timesClicked >= 1) {
                timesClicked -= 1
                txt1.text = timesClicked.toString()
            } else  Toast.makeText(this, "Não pode ser menor que 0", Toast.LENGTH_LONG).show()
        }

    }
}