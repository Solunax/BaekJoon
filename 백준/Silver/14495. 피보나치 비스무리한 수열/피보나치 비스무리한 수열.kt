import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val fibo = Array(117){1L}

    for (i in 4 .. n) {
        fibo[i] = fibo[i - 1] + fibo[i - 3]
    }
    bw.write("${fibo[n]}")

    bw.close()
    br.close()
}