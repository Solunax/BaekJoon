import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var result = 0
    for(i in 1 .. n){
        var sum = 0
        i.toString().forEach {
            sum += it - '0'
        }

        if(i % sum == 0)
            result++
    }
    bw.write("$result")

    br.close()
    bw.close()
}