import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val input = br.readLine()
    var result = 0
    input.replace("pPAp", "1").forEach {
        if(it == '1')
            result++
    }

    bw.write("$result")
    bw.close()
    br.close()
}