import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val a = br.readLine().toLong(2)
    val b = br.readLine().toLong(2)

    bw.write(java.lang.Long.toBinaryString(a*b))

    br.close()
    bw.close()
}