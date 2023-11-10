import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().reversed()
    var count = 0
    val sb = StringBuilder()

    for (i in input.indices) {
        if(count == 3){
            count = 0
            sb.append(",")
        }

        sb.append(input[i])
        count++
    }

    bw.write(sb.reversed().toString())

    bw.close()
    br.close()
}