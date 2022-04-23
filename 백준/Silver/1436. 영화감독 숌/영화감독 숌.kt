import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.min

fun main() {
    val sc = Scanner(System.`in`)

    val input = sc.nextInt()
    var number = 666
    var seq = 0

    while(true){
        val s = number.toString()

        if(s.contains("666")){
            seq++
            if(seq == input)
                break
        }
        number++
    }

    println(number)
}