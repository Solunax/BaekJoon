import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var total = 0
    repeat(4){
        total += br.readLine().toInt()
    }

    bw.write("${total/60}\n${total%60}")

    br.close()
    bw.close()
}