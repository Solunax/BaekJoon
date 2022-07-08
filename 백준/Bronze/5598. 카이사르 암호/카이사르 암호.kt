import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val msg = br.readLine()

    msg.forEach {
        if(it.code - 3 < 65)
            bw.write("${it + 23}")
        else
            bw.write("${it - 3}")
    }

    bw.close()
    br.close()
}