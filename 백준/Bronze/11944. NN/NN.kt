import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ")

    val result = n.repeat(n.toInt())
    if(result.length > m.toInt())
        bw.write(result.substring(0, m.toInt()))
    else
        bw.write(result)

    bw.close()
    br.close()
}