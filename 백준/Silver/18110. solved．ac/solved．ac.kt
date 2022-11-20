import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.roundToInt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var arr = Array(n){0}
    
    if(n == 0)
        bw.write("0")
    else{
        repeat(n){
            arr[it] = br.readLine().toInt()
        }
        arr.sort()

        val cut = (n * 0.15).roundToInt()
        arr = arr.sliceArray(cut..arr.size-1-cut)

        var sum = 0
        arr.forEach {
            sum += it
        }

        bw.write("${(sum.toDouble()/arr.size).roundToInt()}")
    }

    bw.close()
    br.close()
}