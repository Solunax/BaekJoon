import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val arr = br.readLine().split(" ").map { it.toInt() }

    var result = 0
    for(i in 1 until arr.size-1){
        var left = 0
        var right = 0

        for(j in 0 until i)
            left = max(arr[j], left)

        for(j in i+1 until arr.size)
            right = max(arr[j], right)

        if(arr[i] < left && arr[i] < right)
            result += min(left, right) - arr[i]
    }

    bw.write("$result")
    bw.close()
    br.close()
}