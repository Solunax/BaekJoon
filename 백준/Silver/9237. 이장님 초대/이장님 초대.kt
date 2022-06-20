import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val numberOfTree = br.readLine().toInt()
    val array = br.readLine().split(" ").map { it.toInt() }.toTypedArray()

    array.sortDescending()

    var day = 0
    for(i in 0 until numberOfTree)
        day = max(day, array[i] + i + 1)

    bw.write("${day + 1}")
    
    bw.close()
    br.close()
}