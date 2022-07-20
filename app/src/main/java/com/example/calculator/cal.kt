package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class cal : AppCompatActivity() {

    lateinit var firstno:EditText
    lateinit var secondno:EditText
    lateinit var btn_add:Button
    lateinit var btn_subtract:Button
    lateinit var btn_multiply:Button
    lateinit var btn_divide:Button
    lateinit var text_answer: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal)
        btn_add=findViewById(R.id.btn_add)
        btn_subtract=findViewById(R.id.btn_sub)
        btn_multiply=findViewById(R.id.btn_mul)
        btn_divide=findViewById(R.id.btn_div)
        firstno=findViewById(R.id.fnumber)
        secondno=findViewById(R.id.snumber)
        text_answer=findViewById(R.id.answer)

        btn_add!!.setOnClickListener {
            var firstno = firstno.text.toString()
            var secondno = secondno.text.toString()

            if (firstno.isEmpty() && secondno.isEmpty() || firstno.isEmpty() || secondno.isEmpty()){
                text_answer.text="fill first number and second number"
            }else{
                var answer=firstno.toDouble() + secondno.toDouble()
                text_answer.text=answer.toString()
            }
        }
        btn_subtract!!.setOnClickListener {
            var firstno = firstno.text.toString()
            var secondno = secondno.text.toString()

            if (firstno.isEmpty() && secondno.isEmpty() || firstno.isEmpty() || secondno.isEmpty()){
                text_answer.text.toString()
            }else{
                var answer=firstno.toDouble() - secondno.toDouble()
                text_answer.text=answer.toString()
            }
        }
        btn_multiply!!.setOnClickListener {
            var firstno = firstno.text.toString()
            var secondno = secondno.text.toString()

            if (firstno.isEmpty() && secondno.isEmpty() || firstno.isEmpty() || secondno.isEmpty()){
                text_answer.text.toString()
            }else{
                var answer=firstno.toDouble() * secondno.toDouble()
                text_answer.text=answer.toString()
            }
        }
        btn_divide!!.setOnClickListener {
            var firstno = firstno.text.toString()
            var secondno = secondno.text.toString()

            if (firstno.isEmpty() && secondno.isEmpty() || firstno.isEmpty() || secondno.isEmpty()){
                text_answer.text.toString()
            }else{
                var answer=firstno.toDouble() / secondno.toDouble()
                text_answer.text=answer.toString()
            }
        }
    }
    }
