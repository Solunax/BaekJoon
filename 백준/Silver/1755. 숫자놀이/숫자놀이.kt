import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val numbers = listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
    val arr = ArrayList<Pair<String, Int>>()
    val (m, n) = br.readLine().split(" ").map { it.toInt() }

    val sb = StringBuilder()
    for(i in m .. n){
        i.toString().split("").filter { it.isNotEmpty() }.forEach {
            sb.append("${numbers[it.toInt()]} ")
        }

        arr.add(Pair(sb.toString(), i))
        sb.clear()
    }

    val sorted = arr.sortedWith{ o1, o2 ->
        o1.first.compareTo(o2.first)
    }

    var count = 0
    for(i in 0 .. n-m){
        bw.write("${sorted[i].second} ")
        count++
        if(count == 10){
            count = 0
            bw.write("\n")
        }
    }

    br.close()
    bw.close()
}