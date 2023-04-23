import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var result = 0
    var index = 1

    while (index * index <= n){
        result++
        index++
    }
    bw.write("$result")

    bw.close()
    br.close()
}