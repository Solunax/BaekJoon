import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = Array(n){ List(2){0} }
    var result = 0.0

    repeat(n){
        arr[it] = br.readLine().split(" ").map { v -> v.toInt() }
    }

    for(i in 0 until n){
        for(j in i + 1 until n){
            for(k in j + 1 until n)
                result = max(abs((arr[i][0] * arr[j][1] + arr[j][0] * arr[k][1] + arr[k][0] * arr[i][1]) - (arr[j][0] * arr[i][1] + arr[k][0] * arr[j][1] + arr[i][0] * arr[k][1])) / 2.0, result)
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}