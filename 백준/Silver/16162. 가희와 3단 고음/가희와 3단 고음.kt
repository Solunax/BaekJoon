import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, a, d) = br.readLine().split(" ").map { it.toInt() }
    val array = br.readLine().split(" ").map{ it.toInt()}

    var now = a
    var result = 0
    for(i in 0 until n){
        if(array[i] == now){
            result++
            now += d
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}
