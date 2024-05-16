package com.example.kidsmath

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class PlayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        var addtion = findViewById<ImageView>(R.id.addtion)
        addtion.setOnClickListener{
            val calInt = Intent(this@PlayActivity,
                MainActivity::class.java)

            calInt.putExtra("cals","+")
            startActivity(calInt)
        }

        var sub = findViewById<ImageView>(R.id.sub)
        sub.setOnClickListener{
            val calInt = Intent(this@PlayActivity,
                MainActivity::class.java)

            calInt.putExtra("cals","-")
            startActivity(calInt)
        }

        var mul = findViewById<ImageView>(R.id.mul)
        mul.setOnClickListener{
            val calInt = Intent(this@PlayActivity,
                MainActivity::class.java)

            calInt.putExtra("cals","*")
            startActivity(calInt)
        }

        var divie = findViewById<ImageView>(R.id.divie)
        divie.setOnClickListener{
            val calInt = Intent(this@PlayActivity,
                MainActivity::class.java)

            calInt.putExtra("cals","/")
            startActivity(calInt)
        }
    }
}