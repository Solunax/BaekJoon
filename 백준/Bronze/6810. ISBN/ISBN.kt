import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var sum = 91
    sum += br.readLine().toInt() * 1
    sum += br.readLine().toInt() * 3
    sum += br.readLine().toInt() * 1

    bw.write("The 1-3-sum is $sum")

    bw.close()
    br.close()
}