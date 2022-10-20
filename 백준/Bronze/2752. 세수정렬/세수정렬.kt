import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split(" ").map{ it.toInt() }.sorted()

    input.forEach {
        bw.write("$it ")
    }


    bw.close()
    br.close()
}