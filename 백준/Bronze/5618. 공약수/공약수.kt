import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val num = br.readLine().split(" ").map { it.toInt() }

    for (i in 1..num.min()) {
        var count = 0

        num.forEach {
            if (it % i == 0) {
                count++
            }
        }

        if (count == n) {
            bw.write("$i\n")
        }
    }

    bw.close()
    br.close()
}