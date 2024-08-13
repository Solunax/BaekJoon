import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var one = 0
    var two = 0

    br.readLine().forEach {
        if (it == '1') {
            one++
        } else if (it == '2') {
            two++
        }
    }

    if (one > two) {
        bw.write("1")
    } else {
        bw.write("2")
    }

    bw.close()
    br.close()
}