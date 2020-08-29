package com.practice.painting

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Class10Questions : AppCompatActivity() {

        var calbtn: Button?=null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class10_questions)

        calbtn=findViewById(R.id.calculate10);






        calbtn!!.setOnClickListener {

            var i = Intent(this, PieChart::class.java)
            startActivity(i)
        }
    }
}