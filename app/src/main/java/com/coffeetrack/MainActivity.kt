package com.coffeetrack

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var coffeeCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textCount = findViewById<TextView>(R.id.text_count)
        val btnDrink = findViewById<Button>(R.id.btn_drink)

        btnDrink.setOnClickListener {
            coffeeCount++
            textCount.text = "İçilen Kahve: $coffeeCount"
        }
    }
}
