import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (x1, y1, r1) = br.readLine().split(" ").map { it.toLong() }
    val (x2, y2, r2) = br.readLine().split(" ").map { it.toLong() }

    if (((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) < (r1 + r2) * (r1 + r2)) {
        bw.write("YES")
    } else {
        bw.write("NO")
    }

    bw.close()
    br.close()
}