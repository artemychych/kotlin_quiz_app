package com.example.quiz_app


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_results.*


class ResultsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        tvNameResult.text = "Поздравляем, $name"
        tvScore.text = "Ваш счёт: $score/${getQuestions(selected).size}"

        btnFinish.setOnClickListener {
            score = 0

            startActivity(
                Intent(
                    this,
                    MenuActivity::class.java,
                )
            )

        }

    }
}