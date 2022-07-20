package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    var buttonintent:Button ?= null
    var buttoncalc:Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonintent=findViewById(R.id.btn_intent)
        buttonintent!!.setOnClickListener {
            val intent= Intent(this,intent::class.java)
            startActivity(intent)
        }


        buttoncalc=findViewById(R.id.btn_calc)
        buttoncalc!!.setOnClickListener {
            val intent= Intent(this,cal::class.java)
            startActivity(intent)
        }

        }
    }
