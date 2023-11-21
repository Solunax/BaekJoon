import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val c = br.readLine().toInt()
    var check = true

    repeat(n - 1) {
        if (c < br.readLine().toInt()) {
            check = false
        }
    }

    bw.write(
        if (check) {
           "S"
        } else {
            "N"
        }
    )

    bw.close()
    br.close()
}