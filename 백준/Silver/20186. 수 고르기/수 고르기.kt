import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (_, m) = br.readLine().split(" ").map { it.toInt() }
    val input = br.readLine().split(" ").map { it.toInt() }.sortedDescending()

    var sum = 0
    var count = 0
    repeat(m){
        sum += input[it] - count++
    }

    bw.write("$sum")

    br.close()
    bw.close()
}