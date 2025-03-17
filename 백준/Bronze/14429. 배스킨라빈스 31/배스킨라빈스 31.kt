import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var num = 0
    var play = Int.MAX_VALUE

    repeat(n) {
        var (j, m) = br.readLine().split(" ").map { v -> v.toInt() }
        j -= (j - 1) % (m + 1)
        val c = 2 * (j / m + 1)

        if (play > c) {
            num = it + 1
            play = c
        }
    }
    bw.write("$num $play")

    bw.close()
    br.close()
}