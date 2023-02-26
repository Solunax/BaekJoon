import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var sum = 0
    br.readLine().split(" ").map{ it.toInt() }.forEach {
        sum += it
    }

    bw.write("$sum")

    br.close()
    bw.close()
}