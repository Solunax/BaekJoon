import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = Array(n){false}
    var max = 0
    var sticker = 0

    br.readLine().split(" ").map { it.toInt() }.forEach {
        val idx = it-1

        if(!arr[idx]){
            sticker++
            arr[idx] = !arr[idx]
        }else
            sticker--

        if(sticker > max)
            max = sticker
    }

    bw.write("$max")

    bw.close()
    br.close()
}