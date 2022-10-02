import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val (l, n) = br.readLine().split(" ").map { it.toInt() }
        val array = ArrayList<Int>()
        var max = 0
        var min = 0

        repeat(n){
            array.add(br.readLine().toInt())
        }

        array.forEach {
            val temp = min(it, l - it)
            min = max(temp, min)
        }

        array.forEach {
            max = max(max, it)
            max = max(max, l - it)
        }

        bw.write("$min $max\n")
    }

    bw.close()
    br.close()
}