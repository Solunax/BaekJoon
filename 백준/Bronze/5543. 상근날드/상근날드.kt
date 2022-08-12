import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var burger = 10000
    var drink = 10000

    repeat(3){
        burger = min(burger, br.readLine().toInt())
    }

    repeat(2){
        drink = min(drink, br.readLine().toInt())
    }

    bw.write("${burger + drink - 50}")
    bw.close()
    br.close()
}