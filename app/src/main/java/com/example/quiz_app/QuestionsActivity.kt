package com.example.quiz_app

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_questions.*

var score = 0

class QuestionsActivity : AppCompatActivity() {

    private var currentQuestionId = -1
    private var selectedAnswers = mutableMapOf<Int, String>()

    private val originalOptionTextColor = Color.parseColor("#4A4A4A")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val allOptions = arrayListOf(tvOption1, tvOption2, tvOption3, tvOption4)
        val questions: ArrayList<Question> = getQuestions(selected)

        fun changeQuestion() {
            if (currentQuestionId + 1 == questions.size) {
                return startActivity(
                    Intent(
                        this,
                        ResultsActivity::class.java,
                    )
                )
            }
            currentQuestionId += 1

            val question = questions[currentQuestionId]

            tvQuestion.text = question.text

            tvOption1.text = question.option1
            tvOption2.text = question.option2
            tvOption3.text = question.option3
            tvOption4.text = question.option4
        }

        fun resetOptionsColor() {
            for (option in allOptions) {
                option.setTextColor(originalOptionTextColor)
                option.typeface = Typeface.DEFAULT
            }
        }

        for (option in allOptions) {
            option.setOnClickListener {
                resetOptionsColor()

                option.setTextColor(Color.parseColor("#FFFFFF"))
                selectedAnswers[currentQuestionId] = option.text.toString()
            }
        }

        changeQuestion()

        btnAnswerSubmit.setOnClickListener {
            if (selectedAnswers.containsKey(currentQuestionId)) {
                if (currentQuestionId + 1 == questions.size) {
                    for ((questionIndex, answer) in selectedAnswers) {
                        println("${questionIndex.toString()} ${answer.toString()}")
                        if (questions[questionIndex].correctAnswer == answer) {
                            score += 1
                        }
                    }
                }

                changeQuestion()
                resetOptionsColor()
            }
        }
    }


}
