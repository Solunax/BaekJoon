import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var result = 0

    for (a in 1..n) {
        for (b in 1..n) {
            for (c in 1..n) {
                if (a + b + c == n) {
                    if (a % 2 == 0 && c >= b + 2) {
                        result++
                    }
                }
            }
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}