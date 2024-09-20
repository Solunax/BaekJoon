import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val str = br.readLine()
    var remainder = 0L

    str.forEach {
        remainder = (remainder * 10 + (it - '0')) % 20000303
    }

    bw.write("$remainder")

    bw.close()
    br.close()
}