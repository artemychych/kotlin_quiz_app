package com.example.quiz_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_menu.*


var selected = -1

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        test1.setOnClickListener {
            selected = 1
            startActivity(
                Intent(
                    this,
                    QuestionsActivity::class.java,
                )
            )
        }

        test2.setOnClickListener {
            selected = 2
            startActivity(
                Intent(
                    this,
                    QuestionsActivity::class.java,
                )
            )
        }

        test3.setOnClickListener {
            selected = 3
            startActivity(
                Intent(
                    this,
                    QuestionsActivity::class.java,
                )
            )
        }
        test4.setOnClickListener {
            selected = 4
            startActivity(
                Intent(
                    this,
                    QuestionsActivity::class.java,
                )
            )
        }


    }
}