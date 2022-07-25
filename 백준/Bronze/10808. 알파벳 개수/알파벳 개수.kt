import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    val alpha = Array(26){0}

    input.forEach {
        alpha[it.code - 'a'.code]++
    }

    alpha.forEach {
        bw.write("$it ")
    }

    bw.close()
    br.close()
}