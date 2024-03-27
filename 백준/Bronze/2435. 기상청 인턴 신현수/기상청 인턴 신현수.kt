import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()
    
    st = StringTokenizer(br.readLine())
    val arr = ArrayList<Int>()

    for (i in 0 until n) {
        arr.add(st.nextToken().toInt())
    }

    var maxValue = Int.MIN_VALUE

    for (i in 0..n - k) {
        var sum = 0

        for (j in 0 until k) {
            sum += arr[i + j]
        }

        maxValue = max(maxValue, sum)
    }
    bw.write("$maxValue")

    bw.close()
    br.close()
}