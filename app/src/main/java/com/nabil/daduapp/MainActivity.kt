package com.nabil.daduapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nabil.daduapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnRoll.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        val dice = Dice(number = 6)
        val diceRoll = dice.roll()

        val drawableResource = when(diceRoll){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }

        binding.imgDice.setImageResource(drawableResource)

        binding.txtResult.text = diceRoll.toString()
    }
}