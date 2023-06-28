import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var result = 1

    for(i in 1 .. br.readLine().toInt())
        result *= i

    bw.write("$result")

    bw.close()
    br.close()
}