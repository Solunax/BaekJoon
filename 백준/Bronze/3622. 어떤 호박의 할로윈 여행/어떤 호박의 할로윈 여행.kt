import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (la, a, lb, b, p) = br.readLine().split(" ").map { it.toInt() }

    if (la > p || lb > p) {
        bw.write("No")
    } else if (la + lb <= p) {
        bw.write("Yes")
    } else if (a >= lb) {
        bw.write("Yes")
    } else if (b >= la) {
        bw.write("Yes")
    } else {
        bw.write("No")
    }

    bw.close()
    br.close()
}