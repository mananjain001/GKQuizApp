package com.example.gkquiz

data class Questions(
    val id:Int,
    val question:String,
    val optionOne:String,
    val optionTwo:String,
    val optionThree:String,
    val optionFours:String,
    val correctAnswer:Int,
    val image:Int
)