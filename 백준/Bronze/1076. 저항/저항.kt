import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val ohm = HashMap<String, Pair<Int, Int>>()
    ohm["black"] = Pair(0, 1)
    ohm["brown"] = Pair(1, 10)
    ohm["red"] = Pair(2, 100)
    ohm["orange"] = Pair(3, 1000)
    ohm["yellow"] = Pair(4, 10000)
    ohm["green"] = Pair(5, 100000)
    ohm["blue"] = Pair(6, 1000000)
    ohm["violet"] = Pair(7, 10000000)
    ohm["grey"] = Pair(8, 100000000)
    ohm["white"] = Pair(9, 1000000000)

    var result = 0L
    val sb = StringBuilder()
    repeat(3){
        if(it < 2)
            sb.append(ohm[br.readLine()]!!.first)
        else
            result = sb.toString().toInt() * ohm[br.readLine()]!!.second.toLong()
    }
    bw.write("$result")

    bw.close()
    br.close()
}
