import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (v1, v2) = br.readLine().split(" ").map { it.toBigInteger(2) }

    val sum = v1.add(v2)
    bw.write(sum.toString(2))

    bw.close()
    br.close()
}