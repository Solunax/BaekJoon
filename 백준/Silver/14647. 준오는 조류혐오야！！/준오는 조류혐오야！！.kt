import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val map = Array(n){Array(m){0} }

    var nineCount = 0
    repeat(n){ i ->
        val input = br.readLine().split(" ").toTypedArray()
        for(j in 0 until m){
            var nine = 0
            input[j].forEach {
                if(it == '9'){
                    nine++
                    nineCount++
                }
            }
            map[i][j] = nine
        }
    }

    var max = 0
    for(i in 0 until n){
        var sum = 0
        for(j in 0 until m)
            sum += map[i][j]

        max = max(sum, max)
    }

    for(i in 0 until m){
        var sum = 0
        for(j in 0 until n)
            sum += map[j][i]

        max = max(sum, max)
    }

    bw.write("${nineCount - max}")
    bw.close()
    br.close()
}