import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    br.readLine().split(" ").map { it.toInt() }.forEach {
        when (it) {
            300 -> bw.write("1 ")
            in 275 until 300 -> bw.write("2 ")
            in 250 until 275 -> bw.write("3 ")
            else -> bw.write("4 ")
        }
    }

    bw.close()
    br.close()
}