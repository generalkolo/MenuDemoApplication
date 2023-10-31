package com.miu.cs473.assignmenttwo

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {

    private lateinit var resultTextView: TextView
    private lateinit var newFoodEditText: EditText

    private val foodTypes = arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.foodText)
        newFoodEditText = findViewById(R.id.foodEt)
    }

    fun onDecideButtonClick(view: View) {

        val randomIndex = Random.nextInt(foodTypes.size)
        val randomFood = foodTypes[randomIndex]
        resultTextView.text = randomFood
    }

    fun onAddFoodButtonClick(view: View) {
        val newFood = newFoodEditText.text.toString()
        if (newFood.isNotBlank()) {
            foodTypes.add(newFood)
            newFoodEditText.text.clear()
        }
    }
}