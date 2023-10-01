import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val sb = StringBuilder()
    val bite = listOf('A', 'J', 'V')

    br.readLine()
    br.readLine().forEach {
        if(it !in bite)
            sb.append(it)
    }

    if(sb.isEmpty())
        bw.write("nojava")
    else
        bw.write("$sb")

    bw.close()
    br.close()
}