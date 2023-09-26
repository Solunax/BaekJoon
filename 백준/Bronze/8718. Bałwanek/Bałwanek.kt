import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (x, k) = br.readLine().split(" ").map { it.toInt()}
    x *= 1000

    if(k * 7000 <= x)
        bw.write("${k * 7000}")
    else if(k * 3500 <= x)
        bw.write("${k * 3500}")
    else if(k * 1750 <= x)
        bw.write("${k * 1750}")
    else
        bw.write("0")

    bw.close()
    br.close()
}