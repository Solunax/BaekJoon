import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var people = 1
    br.readLine().split(" ").map { it.toInt() }.forEach {
        people *= it
    }

    br.readLine().split(" ").map { it.toInt() }.forEach {
        bw.write("${it - people} ")
    }


    bw.close()
    br.close()
}
