import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (numberOfFixPoint, tapeLength) = br.readLine().split(" ").map { it.toInt() }
    val fixPoint = br.readLine().split(" ").map { it.toInt() }.toTypedArray()

    fixPoint.sort()

    var result = 1
    var start = fixPoint[0] - 0.5
    var range = start + tapeLength
    for(i in 1 until numberOfFixPoint){
        if(!(start < fixPoint[i] && fixPoint[i] <= range - 0.5)){
            start = fixPoint[i] - 0.5
            range = start + tapeLength
            result++
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}
