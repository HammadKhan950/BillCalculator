package com.hammadkhan950.billcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.math.round

class ViewActivity : AppCompatActivity() {

    lateinit var tvFinalAmount: TextView
    var finalAmount: Double = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)
        tvFinalAmount = findViewById(R.id.tvFinalAmount)
        finalAmount = round(intent.getDoubleExtra("value", 0.0))
        tvFinalAmount.text = "The amount to be paid  by each person is approximately: ${finalAmount}"


    }
}

