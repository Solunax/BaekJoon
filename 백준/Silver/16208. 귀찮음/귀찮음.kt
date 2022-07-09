import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val wants = br.readLine().split(" ").map{ it.toInt() }.toTypedArray()
    wants.sort()

    var length = wants.sum().toLong()
    var result = 0L

    for(i in 0 until n){
        length -= wants[i]
        result += wants[i] * length
    }

    bw.write("$result")
    bw.close()
    br.close()
}