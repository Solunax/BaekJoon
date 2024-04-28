import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val now = br.readLine().toInt()
        val next = now + 1

        if (next % (now % 100) == 0) {
            bw.write("Good\n")
        } else {
            bw.write("Bye\n")
        }
    }

    bw.close()
    br.close()
}