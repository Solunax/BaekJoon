import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var result: StringBuilder

fun main() {
    while (true) {
        val input = br.readLine() ?: break
        val len = 3.0.pow(input.toInt()).toInt()
        result = StringBuilder()

        for (i in 0 until len) {
            result.append('-')
        }

        divide(0, len)
        bw.write("$result\n")
    }

    bw.close()
    br.close()
}

fun divide(start: Int, size: Int) {
    if (size <= 1) {
        return
    }

    val new = size / 3
    for (i in start + new until start + new * 2) {
        result.setCharAt(i, ' ')
    }

    divide(start, new)
    divide(start + new * 2, new)
}