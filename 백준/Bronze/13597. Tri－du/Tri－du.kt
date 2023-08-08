import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (v1, v2) = br.readLine().split(" ").map { it.toInt() }

    if(v1 == v2)
        bw.write("$v1")
    else if (v1 > v2)
        bw.write("$v1")
    else
        bw.write("$v2")

    bw.close()
    br.close()
}