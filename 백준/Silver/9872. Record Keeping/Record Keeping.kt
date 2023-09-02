import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val map = HashMap<Triple<String, String, String>, Int>()

    repeat(br.readLine().toInt()){
        val (v1, v2, v3) = br.readLine().split(" ").sorted()
        val temp = Triple(v1, v2, v3)
        
        if(map.containsKey(temp))
            map[temp] = map[temp]!! + 1
        else
            map[temp] = 1
    }

    var result = 0
    map.forEach { _, u ->
        result = max(result, u)
    }

    bw.write("$result")

    bw.close()
    br.close()
}