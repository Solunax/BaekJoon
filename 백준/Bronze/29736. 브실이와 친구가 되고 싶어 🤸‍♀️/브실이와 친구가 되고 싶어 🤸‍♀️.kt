import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b) = br.readLine().split(" ").map { it.toInt() }
    val (k, x) = br.readLine().split(" ").map { it.toInt() }
    var result = 0

    for(i in a .. b){
        if(i in k - x .. k + x)
            result++
    }

    if(result == 0)
        bw.write("IMPOSSIBLE")
    else
        bw.write("$result")

    bw.close()
    br.close()
}