import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    if (n % 2 == 0) {
        repeat(n / 2) {
            bw.write("1 2 ")
        }
    } else {
        repeat(n / 2 + 1) {
            if (it == n / 2) {
                bw.write("3")
            } else {
                bw.write("1 2 ")
            }
        }
    }

    bw.close()
    br.close()
}