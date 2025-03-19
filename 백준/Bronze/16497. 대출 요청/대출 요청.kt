import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val date = IntArray(32)

    repeat(n) {
        val (s, e) = br.readLine().split(" ").map { it.toInt() }
        for (i in s until e) {
            date[i]++
        }
    }

    if (date.max() <= br.readLine().toInt()) {
        bw.write("1")
    } else {
        bw.write("0")
    }

    bw.close()
    br.close()
}