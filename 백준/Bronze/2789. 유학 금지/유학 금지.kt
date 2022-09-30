import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    val codes = listOf('C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E')

    input.forEach {
        if(it !in codes)
            bw.write("$it")
    }

    bw.close()
    br.close()
}