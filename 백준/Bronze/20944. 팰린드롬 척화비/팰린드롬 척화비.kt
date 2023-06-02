import java.io.BufferedReader
import java.io.InputStreamReader


val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = Array(n){"a"}
    bw.write(arr.joinToString(""))

    bw.close()
    br.close()
}