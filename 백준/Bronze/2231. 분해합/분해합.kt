import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val sc = Scanner(System.`in`)

    val input = sc.nextInt()
    var result = 0
    for(i in 1..input){
        var num = i
        var sum = num
        while(num != 0){
            sum += num % 10
            num /= 10
        }
        if(input == sum){
            result = i
            break
        }
    }
    println(result)
}