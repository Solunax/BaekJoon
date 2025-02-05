import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true) {
        val input = br.readLine() ?: break
        val (start, end) = input.split(" ").map { it.toInt() }
        var count = 0

        for (num in start..end) {
            if (checkNumber(num)) {
                count++
            }
        }
        bw.write("$count\n")
    }

    bw.close()
    br.close()
}

fun checkNumber(n: Int): Boolean {
    var num = n
    val check = IntArray(10)

    while (num != 0) {
        if (++check[num % 10] == 2) {
            return false
        }
        num /= 10
    }

    return true
}