import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.min

fun main() {
    val sc = Scanner(System.`in`)
    val sb = java.lang.StringBuilder()

    val count = sc.nextInt()
    val array = Array<Int>(count){0}
    sc.nextLine()

    for(i in 0 until count){
        array[i] = sc.nextInt()
    }

    array.sorted().forEach{ sb.append("$it\n") }
    println(sb)
}