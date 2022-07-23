import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.max
import kotlin.math.round

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val bucket = br.readLine().split(" ").map { it.toInt() }.toTypedArray()

    bucket.sort()
    var result = 0
    var day = 0
    var changeFlag = false

    while(true){
        changeFlag = false

        for(i in 0 until n - k){
            if(bucket[i] != bucket[i + k]){
                result += bucket[i + k] - bucket[i]
                bucket[i + k] = bucket[i]
                changeFlag = true
                break
            }
        }
        bucket.sort()

        if(changeFlag)
            day++
        else
            break
    }
    bw.write("$result $day")

    bw.close()
    br.close()
}