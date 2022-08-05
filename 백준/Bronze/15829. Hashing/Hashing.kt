import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val l = br.readLine().toInt()
    val input = br.readLine()
    val M = 1234567891
    var multi = 1L
    var result = 0L
    input.forEach {
        result += ((it.code - 96)  * multi) % M
        multi = (multi * 31) % M
    }

    bw.write("${result % M}")
    bw.close()
    br.close()
}
