import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    for(i in 0 until n){
        val input = br.readLine()
        bw.write(input.substring(0, 1).uppercase() + input.substring(1) + "\n")
    }

    bw.close()
    br.close()
}