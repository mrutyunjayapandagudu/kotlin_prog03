package com.example.iteradmin.kotlin_prog03

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View) {
        when(v.id)
        {
            R.id.button1 ->{
                Toast.makeText(applicationContext,"button1",Toast.LENGTH_LONG).show()
            }
            R.id.button2 ->{
                Toast.makeText(applicationContext,"button2",Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)
        val login=findViewById<Button>(R.id.button1)
        val forget=findViewById<Button>(R.id.button2)
        login.setOnClickListener(this);
        forget.setOnClickListener(this);
    }


}
