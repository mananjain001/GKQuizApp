package com.example.gkquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility=View.SYSTEM_UI_FLAG_FULLSCREEN

        startButton.setOnClickListener {

            if(nameEditText.text.toString().isEmpty()) {
                Toast.makeText(this,"Please enter your name",Toast.LENGTH_SHORT).show()
            }else{
                val intent:Intent=Intent(applicationContext,QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME,nameEditText.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}
