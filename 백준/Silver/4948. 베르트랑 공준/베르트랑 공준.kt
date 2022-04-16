import java.util.*
import kotlin.math.roundToInt
import kotlin.math.sqrt

fun main() {
    val sc = Scanner(System.`in`)

    val array = Array(246913){true}
    array[0] = false
    array[1] = false

    while(true){
        var count = 0
        val number = sc.nextInt()
        if(number == 0){
            break
        }
        val numberTwice = number * 2

        for(i in 2..sqrt(numberTwice.toDouble()).roundToInt()){
            if(!array[i])
                continue
            for(j in 2 until numberTwice){
                if(i * j <= numberTwice)
                    array[i*j] = false
            }
        }

        for(index in number+1 .. numberTwice){
            if(array[index])
                count++
        }
        println(count)
    }
}