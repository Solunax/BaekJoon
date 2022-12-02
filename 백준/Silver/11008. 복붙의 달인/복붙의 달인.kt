import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val (str, clip) = br.readLine().split(" ")

        bw.write("${str.replace(clip, "1").length}\n")
    }

    br.close()
    bw.close()
}