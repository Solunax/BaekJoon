import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val a = BigInteger(br.readLine())
    val b = BigInteger(br.readLine())
    bw.write("${a.add(b)}\n${a.minus(b)}\n${a.multiply(b)}")

    bw.close()
    br.close()
}