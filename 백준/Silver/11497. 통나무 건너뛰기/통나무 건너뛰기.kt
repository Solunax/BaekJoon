import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val case = br.readLine().toInt()

    for(i in 0 until case){
        val numberOfLog = br.readLine().toInt()
        val array = br.readLine().split(" ").map { it.toInt() }.toTypedArray()
        array.sort()

        val difficulty = Array(numberOfLog){0}
        var left = 0
        var right = numberOfLog - 1
        for(i in 0 until numberOfLog){
            if(i % 2 == 0){
                difficulty[left] = array[i]
                left += 1
            }
            else{
                difficulty[right] = array[i]
                right -= 1
            }
        }
        
        var result = abs(difficulty[0] - difficulty[numberOfLog - 1])
        for(i in 1 until numberOfLog)
            result = max(result, abs(difficulty[i] - difficulty[i - 1]))

        bw.write("$result\n")
    }

    bw.close()
    br.close()
}
