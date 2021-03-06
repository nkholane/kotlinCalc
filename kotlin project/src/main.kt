import java.util.*

fun main(args:Array<String>) {
    val sc = Scanner(System.`in`)
    var i = 0
    var userScore = 0
    val question = 10

    while(i < 10) {
        val op: String
        var answer: Float = 0.0F

        val num1:Float = (0..100).random().toFloat()
        val num2:Float = (0..100).random().toFloat()
        val operator = (0..3).random()


        when (operator) {
            0 -> {
                op = "+"
                answer = num1 + num2
            }
            1 -> {
                op = "-"
                answer = num1 - num2
            }
            2 -> {
                op = "*"
                answer = num1 * num2
            }
            3 -> {
                op = "/"
                answer = num1 / num2
                if(num2 <= 0 ) {
                    println("$answer is undefined")
                }
            }
            else -> op = ""
        }
            println("ONLY NUMERIC VALUES ALLOWED FOR INPUT")
            println("What is the answer for : $num1 $op $num2?")
            val resultEntered: Float = sc.nextFloat()

            if (resultEntered == answer) {
                println("Your answer is correct  --> $answer\n")
                userScore++
            } else {
                println("Wrong answer. The correct answer is: $answer\n")
            }
            i++

    }
    println("Your total of correct answers: $userScore out of $question questions")
}