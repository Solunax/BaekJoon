import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val v1 = br.readLine()
    val v2 = br.readLine()
    val answer = br.readLine()

    if(v1.contains(answer) && v2.contains(answer))
        bw.write("YES")
    else
        bw.write("NO")

    bw.close()
    br.close()
}