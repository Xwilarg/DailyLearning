package com.xwilarg.dailylearning.quizz

import android.os.Bundle
import android.view.View
import android.widget.Button
import com.xwilarg.dailylearning.R

class QuizzChoices : AQuizz() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizz_choices)
        preload()
    }

    fun answer(id: Int) {
        checkAnswer(findViewById<Button>(id).text.toString().toLowerCase())
    }

    fun answer1(view: View) {
        answer(R.id.buttonAnswer1)
    }

    fun answer2(view: View) {
        answer(R.id.buttonAnswer2)
    }

    fun answer3(view: View) {
        answer(R.id.buttonAnswer3)
    }

    fun answer4(view: View) {
        answer(R.id.buttonAnswer4)
    }

    override fun loadQuestionAfter() {
        val choices = getRandomChoices()
        findViewById<Button>(R.id.buttonAnswer1).text = choices[0]
        findViewById<Button>(R.id.buttonAnswer2).text = choices[1]
        findViewById<Button>(R.id.buttonAnswer3).text = if (choices.size > 2) { choices[2] } else { "" }
        findViewById<Button>(R.id.buttonAnswer4).text = if (choices.size > 3) { choices[3] } else { "" }
    }
}