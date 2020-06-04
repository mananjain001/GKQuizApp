package com.example.gkquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    private var iQ: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN

        val username = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = username
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        checkIQ(totalQuestions,correctAnswers)

        tv_score.text="Your Score is $correctAnswers out of $totalQuestions. $iQ"

        btn_finish.setOnClickListener {
            startActivity(Intent(this@ResultActivity,MainActivity::class.java))
            finish()
        }

    }
    private fun checkIQ(totalQuestions:Int,correctAnswers:Int){
        iQ = when {
            totalQuestions-correctAnswers<=80 -> {
                "Your iq level is Low"
            }
            totalQuestions-correctAnswers in 81..159 -> {
                "Your iQ level is Medium"
            }
            else -> {
                "Your iQ level is High"
            }
        }
    }
}
