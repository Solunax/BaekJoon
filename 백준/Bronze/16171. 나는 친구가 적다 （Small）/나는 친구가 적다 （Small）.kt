import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    val search = br.readLine()
    val sb = StringBuilder()

    input.forEach {
        if(it !in '0'..'9')
            sb.append(it)
    }

    val text = sb.toString().replace(search, "1")

    if(text.contains("1"))
        bw.write("1")
    else
        bw.write("0")

    bw.close()
    br.close()
}