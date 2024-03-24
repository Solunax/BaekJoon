import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        val v1 = gcd(a, b)
        val v2 = (a * b) / v1

        bw.write("$v2 $v1\n")
    }

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
