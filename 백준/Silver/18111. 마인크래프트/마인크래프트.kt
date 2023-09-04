import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m, b) = br.readLine().split(" ").map{ it.toInt() }
    val map = Array(n){ Array(m){0} }

    var min = Int.MAX_VALUE
    var max = 0

    repeat(n){
        val input = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()

        map[it] = input

        input.forEach { v ->
            min = min(v, min)
            max = max(v, max)
        }
    }

    var time = Int.MAX_VALUE
    var height = 0

    for(i in min .. max){
        var useTime = 0
        var block = b

        for(j in 0 until n){
            for(k in 0 until m){
                if(i < map[j][k]){
                    useTime += (map[j][k] - i) * 2
                    block += map[j][k] - i
                }else if (i > map[j][k]){
                    useTime += i - map[j][k]
                    block -= i - map[j][k]
                }
            }
        }

        if(block < 0)
            break

        if(time >= useTime){
            time = useTime
            height = i
        }
    }

    bw.write("$time $height")

    bw.close()
    br.close()
}