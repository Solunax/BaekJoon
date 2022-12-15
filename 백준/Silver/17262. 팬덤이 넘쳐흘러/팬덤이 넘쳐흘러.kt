import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var start = -1
    var end = 100001

    repeat(n){
        val input = br.readLine().split(" ").map{ it.toInt() }

        if(start < input[0])
            start = input[0]

        if(end > input[1])
            end = input[1]
    }

    if(start - end < 0)
        bw.write("0")
    else
        bw.write("${start - end}")

    br.close()
    bw.close()
}