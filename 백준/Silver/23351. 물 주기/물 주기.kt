import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k, a, b) = br.readLine().split(" ").map { it.toInt() }
    val catnip = IntArray(n) { k }
    var count = 1
    var idx = 0

    while (true) {
        var check = true
        for (i in idx until idx + a) {
            catnip[i % n] += b
        }

        for (i in 0 until n) {
            if (--catnip[i] == 0) {
                check = false
                break
            }
        }

        if (!check) {
            break
        }

        idx = (idx + a) % n
        count++
    }

    bw.write("$count")

    bw.close()
    br.close()
}