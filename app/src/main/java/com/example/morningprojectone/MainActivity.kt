package com.example.morningprojectone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var myCalc:Button
    lateinit var myContacts:Button
    lateinit var myWeb:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myCalc = findViewById(R.id.mBtnCalc)
        myContacts = findViewById(R.id.mBtnContact)
        myWeb = findViewById(R.id.mBtnWeb)
        myCalc.setOnClickListener {
            val kikokotoo = Intent(this, CalculatorActivity::class.java)
            startActivity(kikokotoo)
        }
        myContacts.setOnClickListener {
            val orodha = Intent(this, ContactsActivity::class.java)
            startActivity(orodha)
        }
        myWeb.setOnClickListener {
            val tembea = Intent(this, WebsiteActivity::class.java)
            startActivity(tembea)
        }
    }
}