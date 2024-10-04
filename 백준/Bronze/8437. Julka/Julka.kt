import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val apple = BigInteger(br.readLine())
    val diff = BigInteger(br.readLine())
    val klaudia = apple.subtract(diff).divide(BigInteger("2")).add(diff)
    val natalia = apple.subtract(diff).divide(BigInteger("2"))

    bw.write("$klaudia\n$natalia")

    bw.close()
    br.close()
}