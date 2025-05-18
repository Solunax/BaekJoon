import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val str = br.readLine()
        if (!str.contains('D')) {
            bw.write("${str.length}\n")
        } else {
            var count = 0

            for (i in str.indices) {
                if (str[i] != 'D') {
                    count++
                } else {
                    break
                }
            }
            bw.write("$count\n")
        }
    }

    bw.close()
    br.close()
}