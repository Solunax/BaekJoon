import java.util.*
import kotlin.math.PI
import kotlin.math.round

fun main() {
    val sc = Scanner(System.`in`)

    val radius = sc.nextDouble()

    println(round(radius * radius * PI * 1000000) / 1000000)
    println(radius * radius * 2)
}