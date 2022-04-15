import java.util.*
import kotlin.math.roundToInt
import kotlin.math.sqrt

fun main() {
    val sc = Scanner(System.`in`)

    var big = sc.nextInt()
    var small = sc.nextInt()

    if(small > big)
         big = small.also { small = big }

    val array = Array(big+ 1){true}
    array[0] = false
    array[1] = false

    for(i in 2..sqrt(big.toDouble()).roundToInt()){
        if(!array[i])
            continue
        for(j in 2 until big){
            if(i*j <= big)
                array[i*j] = false
        }
    }

    for(index in small..big){
        if(array[index])
            println(index)
    }
}