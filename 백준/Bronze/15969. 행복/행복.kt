import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var max = 0
    var min = 1001

    br.readLine()
    br.readLine().split(" ").map{ it.toInt() }.forEach {
        if(it > max)
            max = it

        if(min > it)
            min = it
    }

    bw.write("${max - min}")

    br.close()
    bw.close()
}