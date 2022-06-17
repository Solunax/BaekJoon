import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    bw.write("${fibo(0, 1, br.readLine().toInt())}")

    bw.close()
    br.close()
}

fun fibo(number1: Int, number2: Int, loop:Int): Int {
    return when (loop) {
        0 -> number1
        1 -> number2
        else -> fibo(number2, number1 + number2, loop - 1)
    }
}