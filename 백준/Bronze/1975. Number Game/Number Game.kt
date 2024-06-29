import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        var result = 0

        for (i in 2..n) {
            var temp = n

            while (true) {
                if (temp % i != 0) {
                    break
                }
                result++
                temp /= i
            }
        }

        bw.write("$result\n")
    }

    bw.close()
    br.close()
}