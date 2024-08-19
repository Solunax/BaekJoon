import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (a, p) = br.readLine().split(" ").map { it.toInt() }
    a *= 7
    p *= 13

    if (a == p) {
        bw.write("lika")
    } else if (a > p) {
        bw.write("Axel")
    } else {
        bw.write("Petra")
    }

    bw.close()
    br.close()
}