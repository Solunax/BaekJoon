import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    var count = 0

    repeat(br.readLine().toInt()){
        if(br.readLine() == input)
            count++
    }

    bw.write("$count")

    bw.close()
    br.close()
}