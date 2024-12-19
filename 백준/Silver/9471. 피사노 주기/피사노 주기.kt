import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val (n, m) = br.readLine().split(" ").map { it.toInt() }
        var a = 1
        var b = 1
        var count = 0

        while (true) {
            val next = (a + b) % m
            a = b
            b = next
            count++

            if (a == 1 && b == 1) {
                break
            }
        }

        bw.write("$n $count\n")
    }

    bw.close()
    br.close()
}