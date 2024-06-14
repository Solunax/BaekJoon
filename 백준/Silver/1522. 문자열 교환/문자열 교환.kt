import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val str = br.readLine()
    val aCount = str.count { it == 'a' }
    var result = Int.MAX_VALUE

    for (i in str.indices) {
        var count = 0

        for (j in i until aCount + i) {
            if (str[j % str.length] == 'b') {
                count++
            }
        }

        result = min(result, count)
    }
    bw.write("$result")

    bw.close()
    br.close()
}