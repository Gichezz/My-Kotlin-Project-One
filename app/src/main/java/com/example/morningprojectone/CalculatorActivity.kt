package com.example.morningprojectone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var mFnum:EditText
    lateinit var mSnum:EditText
    lateinit var mAdd:Button
    lateinit var mSub:Button
    lateinit var mMul:Button
    lateinit var mDiv:Button
    lateinit var mAnswer:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        mFnum = findViewById(R.id.mFnumCalc)
        mSnum = findViewById(R.id.mSnumCalc)
        mAdd = findViewById(R.id.mBtnAdd)
        mSub = findViewById(R.id.mBtnSub)
        mMul = findViewById(R.id.mBtnMul)
        mDiv = findViewById(R.id.mBtnDiv)
        mAnswer = findViewById(R.id.mCalcAnswer)
        mAdd.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!!"
            }else{
                var jibu = firstNumber.toDouble() + secondNumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }
        mSub.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!!"
            }else{
                var jibu = firstNumber.toDouble() - secondNumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }
        mMul.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!!"
            }else{
                var jibu = firstNumber.toDouble() * secondNumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }
        mDiv.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!!"
            }else{
                var jibu = firstNumber.toDouble() / secondNumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }
    }
}