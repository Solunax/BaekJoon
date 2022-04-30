import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextLine().toInt()

    for(i in 1 .. input){
        var num1 = sc.nextInt()
        var num2 = sc.nextInt()

        if(num1 > num2)
            num1 = num2.also { num2 = num1 }

        println(num1 * num2 / gcd(num1, num2))
    }
}

fun gcd(numA:Int, numB:Int): Int {
    var a = numA
    var b = numB
    while(true){
        a = b.also { b = a % b }
        if(b == 0)
            break
    }
    return a
}