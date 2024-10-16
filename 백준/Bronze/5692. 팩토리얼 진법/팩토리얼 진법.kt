import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true) {
        val n = br.readLine().reversed()

        if (n == "0") {
            break
        }

        var f = 1
        var sum = 0
        for (i in 1..n.length) {
            f *= i
            sum += f * (n[i - 1] - '0')
        }

        bw.write("$sum\n")
    }

    bw.close()
    br.close()
}