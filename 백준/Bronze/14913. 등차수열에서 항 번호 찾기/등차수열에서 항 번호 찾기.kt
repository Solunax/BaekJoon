import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, d, k) = br.readLine().split(" ").map { it.toInt() }
    var result = "X"

    for (i in 1 .. 1000000) {
        if (a + d * (i - 1) == k) {
            result = i.toString()
            break
        }
    }
    bw.write(result)


    bw.close()
    br.close()
}