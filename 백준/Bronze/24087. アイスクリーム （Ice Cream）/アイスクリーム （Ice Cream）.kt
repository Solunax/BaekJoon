import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var s = br.readLine().trim().toInt()
    val a = br.readLine().trim().toInt()
    val b = br.readLine().trim().toInt()

    if (s - a <= 0) {
        bw.write("250")
    } else {
        s -= a
        val cost = 250 + if (s % b != 0) {
            s / b + 1
        } else {
            s / b
        } * 100

        bw.write("$cost")
    }

    bw.close()
    br.close()
}