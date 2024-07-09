import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true) {
        val n = br.readLine().toInt()

        if (n == 0) {
            break
        }

        var result = 0
        for (i in 1..n) {
            result += i * i
        }

        bw.write("$result\n")
    }

    bw.close()
    br.close()
}