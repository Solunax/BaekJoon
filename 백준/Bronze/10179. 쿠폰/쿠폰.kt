import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val input = br.readLine().toDouble()
        bw.write("$%.2f\n".format(input*0.8))
    }

    bw.close()
    br.close()
}