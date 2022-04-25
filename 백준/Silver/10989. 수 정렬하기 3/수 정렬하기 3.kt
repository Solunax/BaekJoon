import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val count = br.readLine().toInt()
    val numberForCount = Array<Int>(10001){0}

    for(i in 0 until count)
        numberForCount[br.readLine().toInt()]++

    for(i in 1 .. 10000)
        bw.write("$i\n".repeat(numberForCount[i]))

    bw.flush()
    bw.close()
    br.close()
}