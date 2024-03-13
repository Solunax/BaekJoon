import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (_, s) = br.readLine().split(" ").map { it.toInt() }
    val arr = br.readLine().split(" ").map { it.toInt() }
    val distance = ArrayList<Int>()

    for (i in arr.indices) {
        distance.add(abs(s - arr[i]))
    }

    var d = distance[0]

    for (i in 1 until arr.size) {
        d = gcd(d, distance[i])
    }

    bw.write("$d")

    bw.close()
    br.close()
}

fun gcd(v1: Int, v2: Int): Int {
    return if (v2 == 0) {
        v1
    } else {
        gcd(v2, v1 % v2)
    }
}