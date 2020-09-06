package com.hammadkhan950.billcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.EditText
import androidx.core.app.ActivityCompat


class MainActivity : AppCompatActivity() {

    lateinit var etAmount: EditText
    lateinit var etNumberOfFriends: EditText
    lateinit var btnSelect: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etAmount = findViewById(R.id.etAmount)
        etNumberOfFriends = findViewById(R.id.etnumberOfFriends)
        btnSelect = findViewById(R.id.btnSelect)
        btnSelect.setOnClickListener {
            val amount = etAmount.text.toString().toDouble()
            val numberOfFriends = etNumberOfFriends.text.toString().toDouble()
            val total_money = amount / numberOfFriends
            val intent = Intent(this, ViewActivity::class.java)
            intent.putExtra("value", total_money)
            startActivity(intent)

        }
    }

    override fun onBackPressed() {

        ActivityCompat.finishAffinity(this)
    }
}