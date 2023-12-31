import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val fibo = Array(1000001){0}

    fibo[1] = 1
    fibo[2] = 1

    for (i in 3 .. n) {
        fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 1000000007
    }
    bw.write("${fibo[n]}")

    bw.close()
    br.close()
}