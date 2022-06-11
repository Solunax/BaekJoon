import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Collections
import java.util.LinkedList
import java.util.PriorityQueue
import kotlin.math.min
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (changeString, numberOfBrand) = br.readLine().split(" ").map { it.toInt() }
    val single = Array(numberOfBrand){ 0 }
    val pack = Array(numberOfBrand){ 0 }

    for(i in 0 until numberOfBrand){
        val value = br.readLine().split(" ").map { it.toInt() }
        pack[i] = value[0]
        single[i] = value[1]
    }
    pack.sort()
    single.sort()

    var result = Integer.MAX_VALUE

    result = min(((changeString / 6) + 1) * pack[0], changeString * single[0])
    result = min(result, ((changeString / 6) * pack[0]) + (changeString % 6) * single[0])
    bw.write("$result")

    bw.close()
    br.close()
}
