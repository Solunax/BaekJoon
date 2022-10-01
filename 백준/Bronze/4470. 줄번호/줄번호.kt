import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        bw.write("${it+1}. ${br.readLine()}\n")
    }

    bw.close()
    br.close()
}