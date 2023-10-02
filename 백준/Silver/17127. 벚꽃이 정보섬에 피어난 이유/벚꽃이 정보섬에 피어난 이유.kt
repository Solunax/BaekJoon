import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val blossom = br.readLine().split(" ").map { it.toInt() }
    val groupCount = n - 3
    var sum = 0

    if(n == 4){
        blossom.forEach {
            sum += it
        }
    }else{
        var startIndex = 0

        while(startIndex <= n - groupCount){
            var groupSum = 0
            var group = 1

            for(i in 0 until n){
                if(i in startIndex until startIndex + groupCount)
                    group *= blossom[i]
                else
                    groupSum += blossom[i]
            }
            groupSum += group

            sum = max(sum, groupSum)

            startIndex++
        }
    }
    bw.write("$sum")

    bw.close()
    br.close()
}