package com.example.gkquiz

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int=1
    private var mQuestionsList:ArrayList<Questions>?=null
    private var mSelectedOptionPosition:Int=0
    private var mCorrectAnswer:Int=0
    private var mUserName: String? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        mUserName=intent.getStringExtra(Constants.USER_NAME)

        mQuestionsList=Constants.getQuestions()

        setQuestion()

        tv_optionOne.setOnClickListener(this)
        tv_optionTwo.setOnClickListener(this)
        tv_optionThree.setOnClickListener(this)
        tv_optionFour.setOnClickListener(this)
        btn_submit.setOnClickListener(this)
    }

    private fun setQuestion(){

        val question=mQuestionsList!![mCurrentPosition-1]

        defaultOptionsView()

        if(mCurrentPosition == mQuestionsList!!.size){
            btn_submit.text= "FINISH"

        }else{
            btn_submit.text= "SUBMIT"
        }
        progressBar.progress=mCurrentPosition
        tv_progess.text="$mCurrentPosition"+"/"+progressBar.max

        textQuestion.text=question!!.question
        imageQuestion.setImageResource(question.image)
        tv_optionOne.text=question.optionOne
        tv_optionTwo.text=question.optionTwo
        tv_optionThree.text=question.optionThree
        tv_optionFour.text=question.optionFours
    }

    private fun defaultOptionsView(){
        val option=ArrayList<TextView>()
        option.add(0,tv_optionOne)
        option.add(1,tv_optionTwo)
        option.add(2,tv_optionThree)
        option.add(3,tv_optionFour)

        for (options in option){
            options.setTextColor(Color.parseColor("#7A8089"))
                        options.typeface= Typeface.DEFAULT
                        options.background=ContextCompat.getDrawable(
                    this,
                R.drawable.default_option_border_bg
            )
        }
    }

    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.tv_optionOne -> {

                selectedOptionView(tv_optionOne, 1)
            }

            R.id.tv_optionTwo -> {

                selectedOptionView(tv_optionTwo, 2)
            }

            R.id.tv_optionThree -> {

                selectedOptionView(tv_optionThree, 3)
            }

            R.id.tv_optionFour -> {

                selectedOptionView(tv_optionFour, 4)
            }

            R.id.btn_submit -> {

                if (mSelectedOptionPosition == 0) {

                    mCurrentPosition++

                    when {

                        mCurrentPosition <= mQuestionsList!!.size -> {

                            setQuestion()
                        }
                        else -> {


                            val intent =
                                Intent(this@QuizQuestionsActivity, ResultActivity::class.java)
                            intent.putExtra(Constants.USER_NAME, mUserName)
                            intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswer)
                            intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionsList!!.size)
                            startActivity(intent)
                            finish()

                        }
                    }
                } else {
                    val question = mQuestionsList?.get(mCurrentPosition - 1)


                    if (question!!.correctAnswer != mSelectedOptionPosition) {
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                    }
                    else {
                        mCorrectAnswer++
                    }


                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    if (mCurrentPosition == mQuestionsList!!.size) {
                        btn_submit.text = "FINISH"
                    } else {
                        btn_submit.text = "GO TO NEXT QUESTION"

                    }

                    mSelectedOptionPosition = 0
                }
            }
        }
    }


    private fun answerView(answer:Int,drawableView:Int){
        when(answer){
            1->{
                tv_optionOne.background=ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            2->{
                tv_optionTwo.background=ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            3->{
                tv_optionThree.background=ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            4->{
                tv_optionFour.background=ContextCompat.getDrawable(
                    this,drawableView
                )
            }
        }
    }

    private fun selectedOptionView(tv:TextView,
                                   selectedOptionNumber:Int){
        defaultOptionsView()
        mSelectedOptionPosition=selectedOptionNumber

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background=ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg
        )
    }
}
