import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val sc = Scanner(System.`in`)

    val number = sc.nextInt()
    val array = ArrayList<Int>(number)

    for (index in 0 until number)
        array.add(sc.nextInt())

    val divideNumber = arrayOf(2, 3, 5, 7)
    var result = 0
    var flag = true

    for(i in array){
        flag = true
        if(i == 1){
            continue
        }
        if(i in divideNumber){
            result++
        }else{
            for(j in 2 until i){
                if(i % j == 0){
                    flag = false
                    break
                }
            }
            if(flag)
                result++
        }
    }
    println(result)
}