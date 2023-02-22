import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine().toInt()

    var result = 0
    var index = 1
    br.readLine().split(" ").map { it.toInt() }.forEach {
        if(it != index++)
            result++

    }

    bw.write("$result")

    br.close()
    bw.close()
}