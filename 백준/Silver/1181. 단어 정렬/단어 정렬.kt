import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.collections.ArrayList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val inputNumber = br.readLine().toInt()
    val array = ArrayList<String>()

    for(i in 0 until inputNumber){
        val input = br.readLine()
        if(!array.contains(input))
        array.add(input)
    }

    array.sortWith { d1, d2 ->
        if (d1.length == d2.length)
            d1.compareTo(d2)
        else
            d1.length - d2.length
    }

    array.forEach {
        bw.write("$it\n")
    }

    bw.flush()
    bw.close()
    br.close()
}
