package com.example.gkquiz

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Questions>{
        val questionsList=ArrayList<Questions>()
        val que1=Questions(
            1,
            "Which of the following animals least matches the others",
            "Dog",
            "Horse",
            "Lion",
            "Snake",
            4,
            R.drawable.q1

        )

        val que2=Questions(
            2,
            " month before the previous month was may. What month was 3 months before the previous month?",
            "February",
            "March",
            "April",
            "June",
            2,
            R.drawable.q2
        )

        val que3=Questions(
            3,
            "A dozen eggs costs 5.40 pounds. how much costs 24 eggs?",
            "5.40 pounds",
            "10.80 pounds",
            "21.60 pounds",
            "25 pounds",
            2,
            R.drawable.q3
        )

        val que4=Questions(
            4,
            "The finger is in your hand, just like a leaf to?",
            "Tree",
            "Forest",
            "Branch",
            "Trunk",
            3,
            R.drawable.q4
        )

        val que5=Questions(
            5,
            "What number should be next in the series: 1 -1 -2 -3 -5 -8 -13...?",
            "8",
            "17",
            "20",
            "21",
            4,
            R.drawable.q5
        )

        val que6=Questions(
            6,
            "Marta, who is 16 years old, is four times older than her brother Tom. At what age will Marta be when she is 2 times older than Tom?",
            "24",
            "20",
            "26",
            "28",
            1,
            R.drawable.q6
        )

        val que7=Questions(
            7,
            "Which number is 1/4 of 1/2 from 1/5 of 200?",
            "2",
            "4",
            "5",
            "10",
            3,
            R.drawable.q8
        )

        val que8=Questions(
            8,
            "How much square is in the Picture?",
            "20",
            "48",
            "40",
            "38",
            3,
            R.drawable.q7
        )

        val que9=Questions(
            9,
            "Which of the following fits here least?",
            "Flowers",
            "Picture",
            "Poem",
            "Sculpture",
            1,
            R.drawable.q9
        )

        val que10=Questions(
            10,
            "Jany needs 13 bottles of water from the store. She can lift a maximum of 3 bottles at a time. How many times will she have to go to the store minimum?",
            "4",
            "4 1/3",
            "4 1/2",
            "5",
            4,
            R.drawable.q10
        )

        val que11=Questions(
            11,
            "1-8-27-..-125-216.What number is missing in this sequence?",
            "46",
            "54",
            "64",
            "78",
            3,
            R.drawable.q11
        )

        val que12=Questions(
            12,
            "If all Azzy are Bazzy, and all Bazzy is Cazzy- or necessarily all Cazzy are Azzy?",
            "Yes",
            "No",
            "",
            "",
            2,
            R.drawable.q12
        )

        val que13=Questions(
            13,
            "Each rectangle is?",
            "Trapeze",
            "Diamond",
            "Cuboid",
            "Cube",
            1,
            R.drawable.q13
        )

        val que14=Questions(
            14,
            "A certain amount of money is to be divided between 3 friends in a ratio of 2: 8: 10. Tom received the smallest amount, 100 pounds. What is the total amount to be distributed?",
            "1900 pounds",
            "1500 pounds",
            "2000 pounds",
            "1000 pounds",
            4,
            R.drawable.q14
        )

        val que15=Questions(
            15,
            "If the first month of the year would be April. This would be 9 months?",
            "February",
            "October",
            "December",
            "January",
            3,
            R.drawable.q15
        )

        val que16=Questions(
            16,
            "A businesswoman bought jewelry for $ 1,000. At what price should they sell them to earn 10% ?",
            "990$",
            "1100$",
            "1000$",
            "1200$",
            2,
            R.drawable.q16
        )

        val que17=Questions(
            17,
            "Great-grandmother Marc had one son, who had one daughter. Who is he for Marc?",
            "Mother",
            "Grandma",
            "Sister",
            "Aunt",
            2,
            R.drawable.q17
        )

        val que18=Questions(
            18,
            "There is one set. Four-legged table and six four-legged chairs. How many legs in total?",
            "24",
            "20",
            "26",
            "28",
            4,
            R.drawable.q18
        )

        val que19=Questions(
            19,
            "FIPCAKY-Sort the letters and choose the right categories?",
            "Country",
            "Animals",
            "Ocean",
            "River",
            3,
            R.drawable.q19
        )

        val que20=Questions(
            20,
            "Two typists can rewrite two pages in 5 minutes. How many typists are needed to rewrite 20 pages in 10 minutes?",
            "4",
            "5",
            "8",
            "10",
            4,
            R.drawable.q20
        )
        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        questionsList.add(que10)
        questionsList.add(que11)
        questionsList.add(que12)
        questionsList.add(que13)
        questionsList.add(que14)
        questionsList.add(que15)
        questionsList.add(que16)
        questionsList.add(que17)
        questionsList.add(que18)
        questionsList.add(que19)
        questionsList.add(que20)
        return  questionsList
    }
}