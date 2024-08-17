import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val shirts = br.readLine().split(" ").map { it.toInt() }
    val (t, p) = br.readLine().split(" ").map { it.toInt() }

    var resultS = 0
    shirts.forEach { need ->
        resultS += if (need % t == 0) {
            need / t
        } else {
            need / t + 1
        }
    }
    bw.write("$resultS\n${n / p} ${n % p}")

    bw.close()
    br.close()
}