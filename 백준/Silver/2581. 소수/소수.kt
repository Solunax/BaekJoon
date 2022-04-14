import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.roundToInt
import kotlin.math.sqrt

fun main() {
    val sc = Scanner(System.`in`)

    var big = sc.nextInt()
    var small = sc.nextInt()

    if(small > big){
        var temp = big
        big = small
        small = temp
    }
    val array = Array<Boolean>(big + 1){true}
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
    val resultArray = ArrayList<Int>()
    var sum = 0

    for(index in small..big){
        if(array[index]){
            resultArray.add(index)
            sum += index
        }
    }
    if(resultArray.size == 0)
        println(-1)
    else{
        println(sum)
        println(resultArray[0])
    }
}