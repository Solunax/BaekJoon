import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val a = br.readLine().toInt()

    for (i in 1 .. a) {
        if (30 % (i + 1) == 0) {
            bw.write("$i\n")
        }
    }

    bw.close()
    br.close()
}