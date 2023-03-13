import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (v1, v2) = br.readLine().split(" ").map{ it.toLong() }

    if(v1 == v2)
        bw.write("1")
    else
        bw.write("0")

    br.close()
    bw.close()
}