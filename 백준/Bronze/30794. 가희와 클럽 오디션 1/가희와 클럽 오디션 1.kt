import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (lv, type) = br.readLine().split(" ")

    when (type) {
        "miss" -> bw.write("0")
        "bad" -> bw.write("${200 * lv.toInt()}")
        "cool" -> bw.write("${400 * lv.toInt()}")
        "great" -> bw.write("${600 * lv.toInt()}")
        "perfect" -> bw.write("${1000 * lv.toInt()}")
    }

    bw.close()
    br.close()
}