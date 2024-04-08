import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        br.readLine()
        val n = br.readLine()
        var sum = BigInteger.ZERO

        repeat(n.toInt()) {
            sum = sum.add(BigInteger(br.readLine()))
        }

        val check = sum.remainder(BigInteger(n)).toString()

        if (check == "0") {
            bw.write("YES\n")
        } else {
            bw.write("NO\n")
        }
    }

    bw.close()
    br.close()
}