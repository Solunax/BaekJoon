import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val shift = br.readLine().toInt()
    var sum = n.toLong()
    var multiply = 10

    repeat(shift) {
        sum += n * multiply
        multiply *= 10
    }

    bw.write("$sum")

    bw.close()
    br.close()
}