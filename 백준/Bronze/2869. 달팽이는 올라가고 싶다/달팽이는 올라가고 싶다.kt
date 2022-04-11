import java.util.*
import kotlin.collections.ArrayList

fun main(){
    val sc = Scanner(System.`in`)

    val daytime = sc.nextInt()
    val night = sc.nextInt()
    val meter = sc.nextInt()

    var day = (meter - night) / (daytime - night)
    if((meter - night) % (daytime - night) != 0)
        day++

    println(day)
}