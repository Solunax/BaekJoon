import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    when(br.readLine().toInt() % 2){
        0 -> bw.write("SK")
        1 -> bw.write("CY")
    }

    bw.close()
    br.close()
}