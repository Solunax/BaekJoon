import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val num = BigInteger(br.readLine())

    bw.write("${num.multiply(num).multiply(num)}\n3")

    bw.close()
    br.close()
}