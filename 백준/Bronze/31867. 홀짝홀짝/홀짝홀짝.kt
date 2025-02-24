import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val num = br.readLine().toCharArray()
    var even = 0
    var odd = 0

    num.forEach {
        if ((it - '0') % 2 == 0) {
            even++
        } else {
            odd++
        }
    }

    if (even > odd) {
        bw.write("0")
    } else if (even < odd) {
        bw.write("1")
    } else {
        bw.write("-1")
    }

    bw.close()
    br.close()
}