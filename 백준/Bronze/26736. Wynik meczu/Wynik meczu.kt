import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val str = br.readLine().toCharArray()
    bw.write("${str.count { it == 'A' }} : ${str.count { it == 'B' }}")

    bw.close()
    br.close()
}