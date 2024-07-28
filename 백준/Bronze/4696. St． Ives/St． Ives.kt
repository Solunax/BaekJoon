import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true) {
        val n = br.readLine().toDouble()

        if (n == 0.0) {
            break
        }

        var sum = 1.0
        for (i in 0 until 4) {
            var temp = n
            repeat(i) {
                temp *= n
            }
            sum += temp
        }
        bw.write("%.2f\n".format(sum))
    }

    bw.close()
    br.close()
}