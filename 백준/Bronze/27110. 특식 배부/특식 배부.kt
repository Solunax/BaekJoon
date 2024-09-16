import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var result = 0

    br.readLine().split(" ").map { it.toInt() }.forEach {
        result += if (it <= n) {
            it
        } else {
            n
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}