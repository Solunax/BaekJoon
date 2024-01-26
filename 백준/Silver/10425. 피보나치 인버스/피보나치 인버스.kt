import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val fibo = Array(100001) { BigInteger("0") }

fun main() {
    fibo[1] = BigInteger("1")

    for (i in 2..100000) {
        fibo[i] = fibo[i - 1].add(fibo[i - 2])
    }

    repeat(br.readLine().toInt()) {
        val input = BigInteger(br.readLine())
        bw.write("${search(input)}\n")
    }

    bw.close()
    br.close()
}

fun search(n: BigInteger): Int {
    var start = 0
    var end = fibo.size

    while (start < end) {
        val center = (start + end) / 2

        if (n.compareTo(fibo[center]) == 0 || n.compareTo(fibo[center]) == 1) {
            start = center + 1
        } else {
            end = center
        }
    }

    return start - 1
}