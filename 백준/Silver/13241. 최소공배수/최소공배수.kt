import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b) = br.readLine().split(" ").map { it.toLong() }.sortedDescending()
    bw.write("${(a * b) / gcd(a, b)}")

    bw.close()
    br.close()
}


fun gcd(v1: Long, v2: Long): Long {
    return if (v2 == 0L) {
        v1
    } else {
        gcd(v2, v1 % v2)
    }
}