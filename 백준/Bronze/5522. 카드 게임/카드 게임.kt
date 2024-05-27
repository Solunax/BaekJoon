import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var sum = 0

    repeat(5) {
        sum += br.readLine().toInt()
    }
    bw.write("$sum")

    bw.close()
    br.close()
}