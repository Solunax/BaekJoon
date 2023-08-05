import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (_, a, b)= br.readLine().split(" ").map { it.toInt() }

    if(a < b)
        bw.write("Bus")
    else if(a > b)
        bw.write("Subway")
    else
        bw.write("Anything")

    bw.close()
    br.close()
}