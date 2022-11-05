import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val input = br.readLine().split(" ").map { it.toInt() }.toMutableList()

    var now = 1
    var index = 0
    var result = 0

    while(index < n){
        if(input[index] != now){
            result++
        } else
            now++

        index++
    }

    bw.write("$result")
    bw.close()
    br.close()
}