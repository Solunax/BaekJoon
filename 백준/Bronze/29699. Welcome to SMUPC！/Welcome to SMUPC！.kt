import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val str = "WelcomeToSMUPC"

    bw.write("${str[(n - 1) % 14]}")

    bw.close()
    br.close()
}