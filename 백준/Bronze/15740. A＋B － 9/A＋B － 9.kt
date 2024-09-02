import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (v1, v2) = br.readLine().split(" ")
    bw.write("${BigInteger(v1).add(BigInteger(v2))}")

    bw.close()
    br.close()
}