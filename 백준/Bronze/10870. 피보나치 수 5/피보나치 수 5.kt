import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val value = sc.nextInt()

    println(fibonacci(0, 1, value))
}

fun fibonacci (number1:Int, number2:Int, loop:Int):Int{
    return if(loop == 0)
        number1
    else if(loop == 1)
        number2
    else
        fibonacci(number2, number1 + number2, loop - 1)
}