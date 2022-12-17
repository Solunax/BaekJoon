import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split("+", "=").map { it.trim().toInt() }

    if(input[2] == input[0] + input[1])
        bw.write("YES")
    else
        bw.write("NO")

    br.close()
    bw.close()
}