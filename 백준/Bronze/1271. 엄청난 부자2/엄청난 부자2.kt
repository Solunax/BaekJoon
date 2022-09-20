import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (cash, n) = br.readLine().split(" ").map{ it.toBigInteger() }

    bw.write("${cash / n}\n")
    bw.write("${cash % n}")

    bw.close()
    br.close()
}