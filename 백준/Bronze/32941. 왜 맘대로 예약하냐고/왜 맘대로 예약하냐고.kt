import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (_, x) = br.readLine().split(" ").map { it.toInt() }
    val n = br.readLine().toInt()
    var yes = 0

    repeat(n) {
        var check = false
        br.readLine()
        br.readLine().split(" ").map { it.toInt() }.forEach {
            if (x == it) {
                check = true
            }
        }

        if (check) {
            yes++
        }
    }

    if (yes == n) {
        bw.write("YES")
    } else {
        bw.write("NO")
    }

    bw.close()
    br.close()
}