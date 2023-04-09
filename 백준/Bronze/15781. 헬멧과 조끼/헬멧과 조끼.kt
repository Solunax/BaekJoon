import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var result = 0
    br.readLine()

    repeat(2){
        var max = 0
        br.readLine().split(" ").map { it.toInt() }.forEach {
            if(max < it)
                max = it
        }
        result += max
    }

    bw.write("$result")


    br.close()
    bw.close()
}