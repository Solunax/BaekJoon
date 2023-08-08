import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b, c) = br.readLine().split(" ").map { it.toInt() }

    if (a == b && b == c)
        bw.write("*")
    else if(a == b)
        bw.write("C")
    else if(a == c)
        bw.write("B")
    else if(b == c)
        bw.write("A")

    bw.close()
    br.close()
}