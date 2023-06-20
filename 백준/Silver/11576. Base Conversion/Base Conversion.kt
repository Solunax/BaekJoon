import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b) = br.readLine().split(" ").map { it.toInt() }
    br.readLine()

    var sum = 0
    val num = br.readLine().split(" ").map { it.toInt() }.reversed()

    for(i in num.indices)
        sum += num[i] * (a.toDouble().pow(i).toInt())

    val arr = ArrayList<Int>()
    while (sum != 0){
        arr.add(sum % b)
        sum /= b
    }

    arr.reversed().forEach {
        bw.write("$it ")
    }

    bw.close()
    br.close()
}