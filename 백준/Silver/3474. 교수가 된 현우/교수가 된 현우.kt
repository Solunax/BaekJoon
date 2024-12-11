import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val t = countValue(n, 2)
        val f = countValue(n, 5)

        bw.write("${min(t, f)}\n")
    }

    bw.close()
    br.close()
}

fun countValue(n: Int, step: Int): Int {
    var count = 0
    var i = step

    while (i <= n) {
        count += n / i
        i *= step
    }

    return count
}