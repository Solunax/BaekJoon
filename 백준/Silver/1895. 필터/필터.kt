import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (r, c) = br.readLine().split(" ").map { it.toInt() }
    val map = Array(r){Array(c){0}}

    repeat(r){
        map[it] = br.readLine().trim().split(" ").map { v -> v.toInt() }.toTypedArray()
    }
    val t = br.readLine().toInt()
    val filterMap = ArrayList<ArrayList<Int>>()

    for(i in 0 until r-2){
        val arr = ArrayList<Int>()
        for(j in 0 until c-2) {
            val temp = arrayOf(
                map[i][j], map[i][j+1], map[i][j+2],
                map[i+1][j], map[i+1][j+1], map[i+1][j+2],
                map[i+2][j], map[i+2][j+1], map[i+2][j+2]
            )
            temp.sort()
            arr.add(temp[4])
        }
        filterMap.add(arr)
    }

    var result = 0
    filterMap.forEach {
        it.forEach { v ->
            if(v >= t)
                result++
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}