import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b, c) = br.readLine().split(" ").map { it.toInt() }.sorted()

    val diffAB = b - a
    val diffBC = c - b

    if(diffAB == diffBC)
        bw.write("${c + diffAB}")
    else{
        if(diffAB < diffBC)
            bw.write("${b + diffAB}")
        else
            bw.write("${a + diffBC}")
    }

    br.close()
    bw.close()
}