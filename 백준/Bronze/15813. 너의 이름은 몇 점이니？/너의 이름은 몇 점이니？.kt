import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var sum = 0

    br.readLine()
    br.readLine().forEach {
        sum += it - 'A' + 1
    }

    bw.write("$sum")

    bw.close()
    br.close()
}