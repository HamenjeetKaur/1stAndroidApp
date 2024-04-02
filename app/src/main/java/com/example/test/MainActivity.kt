package com.example.test

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.sql.ResultSet

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        var count=0
        val  textView = findViewById(R.id.text1) as TextView
        val button1 = findViewById(R.id.b1) as Button
        val button2 = findViewById(R.id.b2) as Button


        fun reset(){
            count=0
        }
        button1.setOnClickListener {
            count++
            textView.text ="Welcome! Clicked "+count+" times."

        }

        button2.setOnClickListener{
            reset()
            textView.text ="Welcome! Clicked "+count+" times."
        }

    }
}
