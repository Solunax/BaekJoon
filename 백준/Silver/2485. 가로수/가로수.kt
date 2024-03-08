import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = Array(n){0}

    repeat(n) {
        arr[it] = br.readLine().toInt()
    }
    arr.sort()

    var interval = 0
    for (i in 0 until n - 1) {
        val distance = arr[i + 1] - arr[i]
        interval = gcd(distance, interval)
    }

    bw.write("${(arr.last() - arr.first()) / interval + 1 - (arr.size)}")

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