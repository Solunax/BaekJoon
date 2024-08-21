import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var l = false
    var k = false
    var p = false

    repeat(3) {
        val input = br.readLine()

        when (input[0]) {
            'l' -> l = true
            'k' -> k = true
            'p' -> p = true
        }
    }

    if (l && p && k) {
        bw.write("GLOBAL")
    } else {
        bw.write("PONIX")
    }

    bw.close()
    br.close()
}