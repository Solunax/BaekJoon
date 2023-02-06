import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var num = br.readLine()
    var count = 0

    while(num.length != 1){
        var value = 1
        num.forEach {
            value *= it-'0'
        }

        num = value.toString()
        count++
    }

    bw.write("$count")

    br.close()
    bw.close()
}