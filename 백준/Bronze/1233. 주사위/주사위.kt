import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (s1, s2, s3) = br.readLine().split(" ").map { it.toInt() }
    val count = HashMap<Int, Int>()

    for(i in 1 .. s1){
        for(j in 1 .. s2){
            for(k in 1 .. s3){
                val sum = i + j + k
                if(count.containsKey(sum))
                    count[sum] = count[sum]!! + 1
                else
                    count[sum] = 1
            }
        }
    }

    var v = 0
    var result = 0

    count.forEach{
        if(v == it.value)
            result = min(result, it.key)
        else if(v < it.value){
            v = it.value
            result = it.key
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}