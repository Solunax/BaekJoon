import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var v = 11
    var sticker = 1

    while (n >= v){
        v = v * 10 + 1
        sticker++
    }

    bw.write("$sticker")

    bw.close()
    br.close()
}