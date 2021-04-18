package com.example.asquerosikotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var text1 : EditText
    private lateinit var text : EditText
    private lateinit var textview : TextView
    private lateinit var buton : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text=findViewById(R.id.et1) as EditText
        text1=findViewById(R.id.et2) as EditText
        textview=findViewById(R.id.tv1) as TextView
        buton = findViewById(R.id.button) as Button

        buton.setOnClickListener(){

val intent = Intent(this,AsquerosiKotlin2::class.java)
            startActivity(intent)




        }

    }






    }
