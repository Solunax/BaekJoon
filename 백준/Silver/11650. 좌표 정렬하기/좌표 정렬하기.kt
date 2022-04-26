import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.collections.ArrayList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val inputNumber = br.readLine().toInt()
    val arrayXY = ArrayList<Pair<Int, Int>>()

    for(i in 0 until inputNumber){
        val input = br.readLine().split(" ").map{ it.toInt() }
        arrayXY.add(Pair(input[0], input[1]))
    }

    arrayXY.sortWith(Comparator{ a, b ->
        if(a.first == b.first)
            a.second - b.second
        else
            a.first - b.first

    })

    for(i in 0 until inputNumber)
        bw.write("${arrayXY[i].first} ${arrayXY[i].second}\n")

    bw.flush()
    bw.close()
    br.close()
}
