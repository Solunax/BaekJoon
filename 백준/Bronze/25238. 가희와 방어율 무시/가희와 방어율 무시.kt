import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b) = br.readLine().split(" ").map { it.toDouble() }
    
    if(a - a * (b * 0.01) >= 100)
        bw.write("0")
    else
        bw.write("1")

    bw.close()
    br.close()
}