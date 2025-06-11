import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val sleep = br.readLine().toInt()
    val alarm = br.readLine().toInt()

    if (sleep <= 3) {
        bw.write("${alarm - sleep}")
    } else {
        bw.write("${24 - sleep + alarm}")
    }

    bw.close()
    br.close()
}