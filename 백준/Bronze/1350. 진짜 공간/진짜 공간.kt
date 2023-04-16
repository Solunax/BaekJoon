import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine().toInt()
    val file = br.readLine().split(" ").map { it.toLong() }
    val cluster = br.readLine().toLong()
    var result = 0L

    file.forEach {
        if(it != 0L){
            result += it / cluster

            if(it % cluster != 0L)
                result++
        }
    }

    bw.write("${result * cluster}")

    bw.close()
    br.close()
}