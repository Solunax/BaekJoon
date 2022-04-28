import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.collections.ArrayList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val inputNumber = br.readLine().toInt()
    val array = ArrayList<Triple<Int, Int, String>>()

    for(i in 0 until inputNumber){
        val input = br.readLine().split(" ")
        val data = Triple(i, input[0].toInt(), input[1])
        array.add(data)
    }

    array.sortWith { d1, d2 ->
        if(d1.second == d2.second)
            d1.first.compareTo(d2.first)
        else
            d1.second.compareTo(d2.second)
    }
    
    array.forEach {
        bw.write("${it.second} ${it.third}\n")
    }

    bw.flush()
    bw.close()
    br.close()
}
