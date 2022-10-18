import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val diff = 'a' - 'A'
    val input = br.readLine()

    input.forEach {
        if(it in 'A' ..'Z')
            bw.write("${(it+diff)}")
        else
            bw.write("${(it-diff)}")
    }

    bw.close()
    br.close()
}