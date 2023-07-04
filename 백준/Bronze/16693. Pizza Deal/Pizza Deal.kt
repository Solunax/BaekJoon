import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a1, p1) = br.readLine().split(" ").map { v -> v.toDouble() }
    val (a2, p2) = br.readLine().split(" ").map { v -> v.toDouble() }

    if(a1 / p1 < a2 * a2 * Math.PI / p2)
        bw.write("Whole pizza")
    else
        bw.write("Slice of pizza")

    bw.close()
    br.close()
}