import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m, k) = br.readLine().split(" ").map { it.toInt() }
    var v1 = 0L
    val v2 = comb(n, m)

    for (i in k..m) {
        if (n - m < m - i) {
            continue
        } else {
            v1 += comb(m, i) * comb(n - m, m - i)
        }
    }

    bw.write("${v1 / v2.toDouble()}")

    bw.close()
    br.close()
}

fun comb(n: Int, r: Int): Long {
    var fN = n
    var fR = r
    var tN = 1L
    var tR = 1L

    while (fR > 0) {
        tN *= fN--
        tR *= fR--
    }

    return tN / tR
}