import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var sum = 0

    for(i in 1 .. n)
        sum += i * i * i

    bw.write("$sum")

    bw.close()
    br.close()
}