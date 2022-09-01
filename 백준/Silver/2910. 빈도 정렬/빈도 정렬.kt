import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val array = HashMap<Int, Pair<Int, Int>>()
    val (n, c) = br.readLine().split(" ").map { it.toInt() }

    var index = 0
    br.readLine().split(" ").map { it.toInt() }.forEach {
        if(array.containsKey(it))
            array[it] = Pair(array[it]!!.first + 1, array[it]!!.second)
        else
            array[it] = Pair(1, index)
        index++
    }

    val sortArray = array.toList().sortedWith{ o1, o2 ->
        if(o2.second.first != o1.second.first)
            o2.second.first - o1.second.first
        else
            o1.second.second - o2.second.second
    }.forEach {
        repeat(it.second.first){ _ ->
            bw.write("${it.first} ")
        }
    }
    bw.close()
    br.close()
}