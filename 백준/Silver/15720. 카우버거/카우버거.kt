import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (b, c, d) = br.readLine().split(" ").map { it.toInt() }
    val bugger = br.readLine().split(" ").map { it.toInt() }.toTypedArray()
    val side = br.readLine().split(" ").map { it.toInt() }.toTypedArray()
    val drink = br.readLine().split(" ").map { it.toInt() }.toTypedArray()

    bugger.sortDescending()
    side.sortDescending()
    drink.sortDescending()

    val min = min(min(b, c), d)

    var noDiscount = 0
    bugger.forEach {
        noDiscount += it
    }
    side.forEach {
        noDiscount += it
    }
    drink.forEach {
        noDiscount += it
    }
    bw.write("$noDiscount\n")

    var discount = 0
    for(i in 0 until min){
        discount += ((bugger[i] + side[i] + drink[i]) * 0.9).toInt()
    }

    for(i in min until b)
        discount += bugger[i]

    for(i in min until c)
        discount += side[i]

    for(i in min until d)
        discount += drink[i]
    bw.write("$discount")

    bw.close()
    br.close()
}