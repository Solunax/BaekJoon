import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b) = br.readLine().split(" ").map { it.toInt() }
    val chicken = br.readLine().toInt() * 2

    val sum = a+b
    if(sum - chicken < 0)
        bw.write("$sum")
    else
        bw.write("${sum-chicken}")

    br.close()
    bw.close()
}