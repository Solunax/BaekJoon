import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m, k) = br.readLine().split(" ").map { it.toInt() }
    var check = false
    var index = 0

    for (y in 0 until n) {
        for (x in 0 until m) {
            if (index == k) {
                check = true
                bw.write("$y $x")
                break
            } else {
                index++
            }
        }

        if (check) {
            break
        }
    }

    bw.close()
    br.close()
}