import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val array = br.readLine().split(" ").map { it.toInt() }.sorted()

    array.forEach {
        bw.write("$it ")
    }

    bw.close()
    br.close()
}