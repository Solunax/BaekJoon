import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    repeat(n) {
        val (a, b) = br.readLine().split(" ").map { it.toLong() }.sortedDescending()
        bw.write("${lcm(a, b)}\n")
    }

    bw.close()
    br.close()
}

fun lcm(v1: Long, v2: Long): Long {
    return v1 * v2 / gcd(v1, v2)
}

fun gcd(v1: Long, v2: Long): Long {
    if (v1 % v2 == 0L) {
        return v2
    }

    return gcd(v2, v1 % v2)
}