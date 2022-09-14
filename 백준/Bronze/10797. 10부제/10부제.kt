import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    var count = 0
    br.readLine().split(" ").map { it.toInt() }.forEach {
        if(it == n)
            count++
    }
    bw.write("$count")
    bw.close()
    br.close()
}
