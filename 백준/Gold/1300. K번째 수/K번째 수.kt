import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val k = br.readLine().toInt()

    var lowIndex = 1L
    var highIndex = k.toLong()

    while(lowIndex < highIndex){
        val center = (lowIndex + highIndex) / 2L
        var count = 0L

        for(i in 1 .. n){
            count += min(center / i, n.toLong())
        }

        if(k <= count)
            highIndex = center
        else
            lowIndex = center + 1
    }

    bw.write("$lowIndex")

    br.close()
    bw.close()
}