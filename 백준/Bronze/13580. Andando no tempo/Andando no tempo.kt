import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (v1, v2, v3) = br.readLine().split(" ").map { it.toInt() }.sorted()

    if(v1 == v2 || v2 == v3 || v1 + v2 == v3)
        bw.write("S")
    else
        bw.write("N")

    bw.close()
    br.close()
}