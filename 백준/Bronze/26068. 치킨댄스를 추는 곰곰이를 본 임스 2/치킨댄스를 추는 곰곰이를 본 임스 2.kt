import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var result = 0

    repeat(br.readLine().toInt()){
        val (_, date) = br.readLine().split("-")
        if(date.toInt() <= 90 )
            result++
    }
    bw.write("$result")

    br.close()
    bw.close()
}

