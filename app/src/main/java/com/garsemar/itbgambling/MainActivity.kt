package com.garsemar.itbgambling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    val listOfImages = listOf(R.drawable.dice_1,
        R.drawable.dice_2,
        R.drawable.dice_3,
        R.drawable.dice_4,
        R.drawable.dice_5,
        R.drawable.dice_6)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun rollDice(view: View){
        val image = findViewById<ImageView>(R.id.imageView5)
        val image2 = findViewById<ImageView>(R.id.imageView6)
        val num1 = (0..5).random()
        val num2 = (0..5).random()
        if(num1 == num2) message()
        image.setImageResource(listOfImages[num1])
        image2.setImageResource(listOfImages[num2])
        image.visibility = View.VISIBLE
        image2.visibility = View.VISIBLE
    }
    fun reset(view: View){
        val image = findViewById<ImageView>(R.id.imageView5)
        val image2 = findViewById<ImageView>(R.id.imageView6)
        if(image.isVisible && image2.isVisible){
            image.visibility = View.INVISIBLE
            image2.visibility = View.INVISIBLE
        }
    }
    private fun message(){
        Toast.makeText(applicationContext, "JACKPOT!", Toast.LENGTH_SHORT).show()
    }
}