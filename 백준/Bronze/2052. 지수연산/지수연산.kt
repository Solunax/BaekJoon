import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val result = 0.5.toBigDecimal().pow(n)
    var str = "%.300f".format(result)

    for (i in str.length - 1 downTo 0) {
        if (str[i] != '0') {
            str = str.substring(0, i + 1)
            break
        }
    }
    bw.write(str)

    bw.close()
    br.close()
}