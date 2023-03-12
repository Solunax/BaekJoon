import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (beR, beC) = br.readLine().split(" ").map { it.toInt() }
    val (daR, daC) = br.readLine().split(" ").map { it.toInt() }
    val (joR, joC) = br.readLine().split(" ").map { it.toInt() }

    val be = max(abs(joR - beR), abs(joC - beC))
    val da = abs(joR - daR) + abs(joC - daC)

    if(da < be)
        bw.write("daisy")
    else if(be < da)
        bw.write("bessie")
    else
        bw.write("tie")

    br.close()
    bw.close()
}