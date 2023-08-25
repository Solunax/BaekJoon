import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var result = 0

    repeat(br.readLine().toInt()){
        var sum = 0
        var str = br.readLine()

        str = str.replace("for", "1")
        str = str.replace("while", "1")

        str.forEach {
            if(it == '1')
                sum++
        }

        result = max(result, sum)
    }

    bw.write("$result")

    bw.close()
    br.close()
}