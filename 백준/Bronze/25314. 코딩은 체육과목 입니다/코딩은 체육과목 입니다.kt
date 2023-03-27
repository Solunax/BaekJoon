import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt() / 4){
        bw.write("long ")
    }
    bw.write("int")

    br.close()
    bw.close()
}