import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val fibo = Array(1001) { BigInteger("0") }
    fibo[1] = BigInteger("1")
    fibo[2] = BigInteger("2")

    for (i in 3..1000) {
        fibo[i] = fibo[i - 1].add(fibo[i - 2])
    }

    while (true) {
        val input = br.readLine().split(" ")
        val v1 = BigInteger(input[0])
        val v2 = BigInteger(input[1])

        if (v1 == BigInteger.ZERO && v2 == BigInteger.ZERO) {
            break
        }

        var result = 0
        for (i in 1..1000) {
            if (fibo[i] in v1..v2) {
                result++
            }
        }
        bw.write("$result\n")
    }

    bw.close()
    br.close()
}