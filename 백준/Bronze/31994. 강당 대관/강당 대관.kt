import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var name = ""
    var max = 0

    repeat(7) {
        val (t, n) = br.readLine().split(" ")
        if (n.toInt() > max) {
            max = n.toInt()
            name = t
        }
    }
    bw.write(name)

    bw.close()
    br.close()
}