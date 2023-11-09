import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true) {
        val input = br.readLine()

        if (input.isNullOrEmpty()) {
            break
        }

        var (n, b, m) = input.split(" ").map { it.toDouble() }
        b = b * 0.01 + 1
        var result = 0

        while (true) {
            if (n >= m)
                break

            n *= b
            result++
        }

        bw.write("$result\n")
    }

    bw.close()
    br.close()
}