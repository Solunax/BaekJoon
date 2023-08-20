import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val input = br.readLine()
        val n = sqrt(input.length.toDouble()).toInt()
        val enc = Array(n){Array(n) {""} }
        var last = n

        for(i in 0 until n){
            enc[i] = input.substring(i * n, last).split("").filter { it.isNotEmpty() }.toTypedArray()
            last += n
        }

        for(i in n - 1 downTo 0){
            for(j in 0 until n){
                bw.write(enc[j][i])
            }
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}