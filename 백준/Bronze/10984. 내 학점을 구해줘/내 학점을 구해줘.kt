import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val n = br.readLine().toInt()
        var sum = 0
        var gpaSum = 0.0

        repeat(n){
            val(a, b) = br.readLine().split(" ").map{ it.toDouble() }
            sum += a.toInt()
            gpaSum += a * b
        }

        bw.write(String.format("%d %.1f\n", sum, gpaSum / sum))
    }

    br.close()
    bw.close()
}