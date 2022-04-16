import java.lang.Math.abs
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.roundToInt
import kotlin.math.sqrt

fun main() {
    val sc = Scanner(System.`in`)

    val case = sc.nextInt()
    sc.nextLine()

    val array = Array(10001){true}
    array[0] = false
    array[1] = false

    for(i in 2..sqrt(10000.0).toInt()){
        if(!array[i])
            continue
        for(j in 2 until 10000){
            if(i*j <= 10000)
                array[i*j] = false
        }
    }

    for(pos in 1..case){
        val number = sc.nextInt()

        val primeNumberArray = ArrayList<Int>()
        for(index in 0 .. number){
            if(array[index])
                primeNumberArray.add(index)
        }

        var (num1, num2) = Pair(0, 0)
        var sequence = primeNumberArray.size - 1
        var bef = arrayOf(0, 10000)

        while(sequence != -1){
            num2 = primeNumberArray[sequence]

            for(a in primeNumberArray){
                if(num2 + a == number){
                    num1 = a
                    if(bef[1] - bef[0] > kotlin.math.abs(num2 - num1)){
                        bef[1] = num2
                        bef[0] = num1
                    }
                }
            }
            sequence--
        }

        println("${bef[0]} ${bef[1]}")
    }
}