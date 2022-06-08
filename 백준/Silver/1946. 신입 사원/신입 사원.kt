import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import java.util.Arrays.sort
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val case = br.readLine().toInt()

    for(i in 0 until case){
        var flag = true
        val numberOfApplicant = br.readLine().toInt()
        val array = Array(numberOfApplicant + 1){0}

        for(j in 0 until numberOfApplicant){
            val (a, b) = br.readLine().split(" ").map { it.toInt() }
            array[a] = b
        }

        var result = 1
        var min = array[1]

        for(j in 2 .. numberOfApplicant){
            if(array[j] < min){
                result++
                min = array[j]
            }
        }
        bw.write("$result\n")
    }

    bw.close()
    br.close()
}
