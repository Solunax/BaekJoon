import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (l, r) = br.readLine().split(" ")
    var count = 0

    if (l.length == r.length) {
        for (i in l.indices) {
            if (l[i] != r[i]) {
                break
            } else {
                if (l[i] == '8') {
                    count++
                }
            }
        }
    }
    bw.write("$count")

    bw.close()
    br.close()
}