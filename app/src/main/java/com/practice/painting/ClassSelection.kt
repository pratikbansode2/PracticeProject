package com.practice.painting

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ClassSelection : AppCompatActivity() {

    var cls10sel: Button?=null;
    var cls12sel: Button?=null;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class_selection)
        cls10sel=findViewById(R.id.Class10)
        cls12sel=findViewById(R.id.Class12)


        cls10sel!!.setOnClickListener{
            var i= Intent(this,Class10Questions::class.java )
            startActivity(i)
        }

        cls12sel!!.setOnClickListener {
            var i=Intent(this,Class12Questions::class.java )
            startActivity(i)
        }



    }


}