import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val r = br.readLine().toInt()
    val c = br.readLine().toInt()

    repeat(r){
        repeat(c){
            bw.write("*")
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}