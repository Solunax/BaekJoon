import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.collections.ArrayList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val inputNumber = br.readLine().toInt()
    val array = ArrayList<Int>()
    val map = HashMap<Int, Int>()
    val input = br.readLine().split(" ")
    var seq = 0

    for(i in 0 until inputNumber)
        array.add(input[i].toInt())

    val sorting = array.sorted()
    sorting.forEach{
        if(!map.containsKey(it)){
            map[it] = seq
            seq++
        }
    }

    array.forEach {
        bw.write("${map[it]!!} ")
    }

    bw.flush()
    bw.close()
    br.close()
}
