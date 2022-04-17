import java.lang.Math.abs
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.roundToInt
import kotlin.math.sqrt

fun main() {
    val sc = Scanner(System.`in`)

    val x = sc.nextInt()
    val y = sc.nextInt()
    val width = sc.nextInt()
    val height = sc.nextInt()

    val array = arrayOf(x, y, height - y, width - x)
    var result = array[0]

    array.forEach {
        if(result > it)
            result = it
    }

    println(result)
}