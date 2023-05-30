import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val sb = StringBuilder()

    for(i in 1 .. n)
        sb.append("$i")

    bw.write("${sb.indexOf(n.toString()) + 1}")

    bw.close()
    br.close()
}