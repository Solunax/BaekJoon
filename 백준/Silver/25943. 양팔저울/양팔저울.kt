import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
fun main() {
    val weight = listOf(100, 50, 20, 10, 5, 2, 1)
    val n = br.readLine().toInt()
    val stone = br.readLine().split(" ").map { it.toInt() }

    var left = stone[0]
    var right = stone[1]

    for(i in 2 until n){
        if(left == right)
            left += stone[i]
        else{
            if(left > right)
                right += stone[i]
            else
                left += stone[i]
        }
    }

    if(left == right)
        bw.write("0")
    else{
        var diff = abs(left - right)
        var count = 0

        weight.forEach {
            val temp = diff / it

            if(temp != 0){
                diff -= temp * it
                count += temp
            }
        }

        bw.write("$count")
    }

    br.close()
    bw.close()
}