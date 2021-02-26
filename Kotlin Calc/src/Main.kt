import java.util.*

fun main(args:Array<String>) {
    val sc = Scanner(System.`in`)
    var a:String
    var i: Int = 0
    var userScore: Int = 0
    val question:Int = 10

    do
    {
            val op: String
            var answer = 0

            val num1 = (0..100).random()
            val num2 = (0..100).random()
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
                }
                else -> op = ""
            }

            println("What is the answer for : $num1 $op $num2?")
            val resultEntered: Int = sc.nextInt()
            if (resultEntered == answer) {
                println("Your answer is correct  :$answer")
                userScore++
            }
            else {
                println("Wrong answer. The correct answer is: $answer")

            }
        i++

            println("Continue? y/n")
            a = sc.next()


        println("Your total of correct answers: $userScore out of $question questions")

    } while (a == "y" && i < 10)

}