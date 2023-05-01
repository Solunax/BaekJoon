import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var result = 0
    br.readLine().split(" ").map { it.toInt() }.forEach{
        if(it > 0)
            result++
    }

    bw.write("$result")

    bw.close()
    br.close()
}