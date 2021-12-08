package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var  result: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val roll: Button = findViewById(R.id.button)
        roll.setOnClickListener{
            rolldice()
        }
        result =findViewById(R.id.imageView)
    }

    private fun rolldice() {

        val randomNo = Random.nextInt(6)+1
        val resultImage = when(randomNo){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        result.setImageResource(resultImage)
    }
}