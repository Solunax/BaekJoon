import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var n = br.readLine().toInt()

    while (true) {
        if (n % 2 != 0) {
            break
        } else {
            n /= 2
        }
    }

    if (n == 1) {
        bw.write("1")
    } else {
        bw.write("0")
    }

    bw.close()
    br.close()
}