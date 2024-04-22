package com.example.Reto02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import java.util.*
import kotlin.concurrent.schedule


class MainActivity : AppCompatActivity() {

    private lateinit var boton: Button
    private lateinit var T1: EditText
    private lateinit var T2: EditText
    private lateinit var T3: EditText
    private lateinit var T4: EditText
    private lateinit var authResultImageView:ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton = findViewById(R.id.btnAccept)
        T1 = findViewById(R.id.editText)
        T2 = findViewById(R.id.editText2)
        T3 = findViewById(R.id.editText3)
        T4 = findViewById(R.id.editText4)
        authResultImageView = findViewById(R.id.authResultImageView)

        boton.setOnClickListener{

            val VoF = T1.text.isEmpty() || T2.text.isEmpty() || T3.text.isEmpty() || T4.text.isEmpty()
            if (VoF) {
                authResultImageView.setImageResource(R.drawable.error_image)
            } else {
                authResultImageView.setImageResource(R.drawable.success_image)
                Timer("HideSuccessImage", false).schedule(5000) {
                    runOnUiThread {
                        authResultImageView.visibility = View.INVISIBLE
                    }
                }
            }
            authResultImageView.visibility = View.VISIBLE
        }
    }
}