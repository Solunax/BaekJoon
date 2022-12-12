import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    if(br.readLine().endsWith("driip"))
        bw.write("cute")
    else
        bw.write("not cute")

    br.close()
    bw.close()
}