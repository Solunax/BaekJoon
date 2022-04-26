import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.collections.ArrayList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    var input = br.readLine().toInt()
    val array = ArrayList<Int>()

    while(input != 0){
        array.add(input % 10)
        input /= 10
    }

    array.sortedDescending().forEach {
        bw.write(it.toString())
    }
    bw.flush()
    bw.close()
    br.close()
}