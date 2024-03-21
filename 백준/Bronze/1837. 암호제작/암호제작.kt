import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toBigInteger() }
    var index = BigInteger("1")

    while (true) {
        if (index.compareTo(k) == 1 || index.compareTo(k) == 0) {
            bw.write("GOOD")
            break
        }

        index = index.add(BigInteger("1"))

        if (n.remainder(index).compareTo(BigInteger.ZERO) == 0 && index.compareTo(k) == -1) {
            bw.write("BAD $index")
            break
        }
    }

    bw.close()
    br.close()
}