import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt() - 1
    val animal = "JKLABCDEFGHI"
    val num = "7890123456"

    bw.write("${animal[n % 12]}${num[n % 10]}")

    bw.close()
    br.close()
}