import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, _) = br.readLine().split(" ").map { it.toInt() }
    val hole = br.readLine().split(" ").map { it.toInt() }
    var count = 0

    hole.forEach {
        count += if (it % 2 == 0) {
            it / 2
        } else {
            it / 2 + 1
        }
    }

    if (count >= n) {
        bw.write("YES")
    } else {
        bw.write("NO")
    }

    bw.close()
    br.close()
}