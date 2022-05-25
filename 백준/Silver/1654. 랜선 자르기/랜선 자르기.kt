import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Hashtable
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (k, n) = br.readLine().split(" ").map { it.toInt() }
    val lanCable = LinkedList<Int>()

    for(i in 0 until k)
        lanCable.add(br.readLine().toInt())

    lanCable.sort()

    var low = 0L
    var high = lanCable[k - 1] + 1L
    while(low < high){
        val center = (high + low) / 2
        var makeCount = 0L

        for(i in 0 until k)
            makeCount += lanCable[i] / center

        if(makeCount < n)
            high = center
        else
            low = center + 1
    }

    bw.write("${low - 1}")

    br.close()
    bw.close()
}