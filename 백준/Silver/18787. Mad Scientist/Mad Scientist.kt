import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val a = br.readLine()
    val b = br.readLine()
    var flag = true
    var count = 0

    for (i in 0 until n) {
        if (flag && a[i] != b[i]) {
            flag = false
            count++
        }

        if (a[i] == b[i]) {
            flag = true
        }
    }

    bw.write("$count")

    bw.close()
    br.close()
}