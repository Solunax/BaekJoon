import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split(" ")
    val k = BigInteger(input[0])
    val l = input[1].toInt()
    var bad = 0

    for (i in 2 until l) {
        if (k % i.toBigInteger() == BigInteger.ZERO) {
            bad = i
            break
        }
    }

    if (bad == 0) {
        bw.write("GOOD")
    } else {
        bw.write("BAD $bad")
    }

    bw.close()
    br.close()
}