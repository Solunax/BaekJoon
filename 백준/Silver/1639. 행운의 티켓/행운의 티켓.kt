import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val str = br.readLine()
    var n: Int
    var result = 0

    for (i in 1..str.length) {
        n = i * 2

        for (j in 0 until str.length - n + 1) {
            val sub = str.substring(j, j + n)

            if (getSumValue(sub.substring(0, n / 2)) == getSumValue(sub.substring(n / 2))) {
                result = n
                break
            }
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}

fun getSumValue(str: String): Int {
    var sum = 0
    for (i in str.indices) {
        sum += str[i] - '0'
    }

    return sum
}