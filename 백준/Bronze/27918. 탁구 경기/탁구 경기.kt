import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var d = 0
    var p = 0

    for(i in 0 until n){
        when(br.readLine()){
            "D" -> d++
            "P" -> p++
        }

        if(abs(d - p) >= 2)
            break
    }

    bw.write("$d:$p")

    bw.close()
    br.close()
}