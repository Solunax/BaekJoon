import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Hashtable
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val woodHeight = br.readLine().split(" ").map { it.toInt() }.toMutableList()

    woodHeight.sort()

    var low = 0L
    var high = woodHeight[n - 1] + 1L

    while(low < high){
        val center = (high + low) / 2
        var length = 0L

        for(i in 0 until n){
            val cutLength = woodHeight[i] - center
            if(cutLength > 0)
                length += cutLength
        }
        
        if(length < m)
            high = center
        else
            low = center + 1
    }

    bw.write("${low - 1}")

    br.close()
    bw.close()
}