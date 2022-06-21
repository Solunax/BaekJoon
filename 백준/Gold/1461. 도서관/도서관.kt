import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val input = br.readLine().split(" ").map { it.toInt() }.toTypedArray()

    val plus = ArrayList<Int>()
    val minus = ArrayList<Int>()
    var max = 0

    input.forEach {
        if(it > 0)
            plus.add(it)
        else
            minus.add(abs(it))

        if(max < abs(it))
            max = abs(it)
    }

    plus.sortDescending()
    minus.sortDescending()
    var result = 0

    for(i in plus.indices){
        if(i % m == 0 && plus[i] == max)
            result += plus[i]
        else if(i % m == 0)
            result += plus[i] * 2
    }

    for(i in minus.indices){
        if(i % m == 0 && minus[i] == max)
            result += minus[i]
        else if(i % m == 0)
            result += minus[i] * 2
    }

    bw.write("$result")

    bw.close()
    br.close()
}