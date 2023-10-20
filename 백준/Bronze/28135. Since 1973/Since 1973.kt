import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var result = 0

    for(n in 0 until br.readLine().toInt()){
        result++

        if(n.toString().contains("50"))
            result++
    }
    bw.write("$result")

    bw.close()
    br.close()
}