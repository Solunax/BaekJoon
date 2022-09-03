import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val a = br.readLine().split(" ").map { it.toInt() }
    val b = br.readLine().split(" ").map { it.toInt() }
    val resultArray = ArrayList<Int>()
    val map = HashMap<Int, Int>()
    a.forEach {
        map[it] = 1
    }

    b.forEach {
        if(map.containsKey(it))
            map[it] = map[it]!! + 1
    }

    map.forEach{
        if(it.value == 1)
            resultArray.add(it.key)
    }
    
    resultArray.sort()
    bw.write("${resultArray.size}\n")
    resultArray.forEach {
        bw.write("$it ")
    }

    bw.close()
    br.close()
}