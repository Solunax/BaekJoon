import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k, s) = br.readLine().split(" ").map { it.toInt() }
    val screw = br.readLine().split(" ").map { it.toInt() }.sortedDescending()
    val needScrew = k * s
    var now = 0
    var result = 0

    for(i in 0 until n){
        result++
        now += screw[i]
        
        if(now >= needScrew)
            break
    }

    bw.write("$result")

    bw.close()
    br.close()
}