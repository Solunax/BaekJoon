import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    if(br.readLine().startsWith("555"))
        bw.write("YES")
    else
        bw.write("NO")

    bw.close()
    br.close()
}