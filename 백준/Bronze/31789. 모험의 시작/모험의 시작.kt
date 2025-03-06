import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val (money, req) = br.readLine().split(" ").map { it.toInt() }
    var check = false

    repeat(n) {
        val (pay, atk) = br.readLine().split(" ").map { it.toInt() }

        if (pay <= money && req < atk) {
            check = true
        }
    }

    if (check) {
        bw.write("YES")
    } else {
        bw.write("NO")
    }

    bw.close()
    br.close()
}