package com.kotline_one

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

        lateinit var Intentone:Intent
         lateinit var valuetext:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

                Intentone = getIntent()

                valuetext = Intentone.getStringExtra("First")


        var textView:TextView = findViewById(R.id.textviewActivity2) as TextView

        textView.setText("KOthari Love")


        var but = findViewById<Button>(R.id.buttionActivity_two) as Button

        but.setOnClickListener {

            var intent = Intent(applicationContext,MainActivity::class.java)
            intent.putExtra("first",123)
            startActivity(intent)

        }

        if(valuetext != null){

            textView.setText(valuetext)

        }

    }
}
