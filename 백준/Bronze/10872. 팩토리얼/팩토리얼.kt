import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val value = sc.nextInt()

    println(factorial(1, value))
}

fun factorial(add:Int, number:Int):Int{
    return if(number <= 0)
        add
    else
        factorial(add * number, number - 1)
}