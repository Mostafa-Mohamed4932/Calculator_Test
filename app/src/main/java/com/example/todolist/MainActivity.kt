package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() , View.OnClickListener {

    lateinit var btn_Add : Button
    lateinit var btn_Multiplication : Button
    lateinit var btn_Substraction: Button
    lateinit var btn_division : Button
    lateinit var etA : EditText
    lateinit var etB : EditText
    lateinit var resultTv : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_Add = findViewById(R.id.btn_add)
        btn_Multiplication = findViewById(R.id.btn_multiplication)
        btn_Substraction = findViewById(R.id.btn_substraction)
        btn_division = findViewById(R.id.btn_division)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        resultTv = findViewById(R.id.result_tv)

        btn_Add.setOnClickListener(this)
        btn_Substraction.setOnClickListener(this)
        btn_Multiplication.setOnClickListener(this)
        btn_division.setOnClickListener(this)




    }

    override fun onClick(v: View?) {
        var a = etA.text.toString().toDouble()  //getter, no need to type gettext like java or other languages
        var b = etB.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.btn_add ->{
                result = a+b
            }
            R.id.btn_substraction ->{
                result = a-b
            }
            R.id.btn_multiplication ->{
                result = a*b
            }
            R.id.btn_division ->{
                result = a/b
            }

        }
        resultTv.text = "Result is $result"


    }
}