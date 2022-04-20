import java.util.*
import kotlin.math.pow

fun main() {
    val sc = Scanner(System.`in`)
    val sb = StringBuilder()
    val value = sc.nextInt()

    fun move(number:Int, start:Int, sub:Int, to:Int) {
        if(number == 0)
            return

        move(number - 1, start, to, sub)
        sb.append("$start $to\n")
        move(number - 1, sub, start, to)
    }
    move(value, 1, 2, 3)
    println(2.0.pow(value.toDouble()).toInt() - 1)
    println(sb)
}