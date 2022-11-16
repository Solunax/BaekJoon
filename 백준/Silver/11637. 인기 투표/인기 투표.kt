import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val n = br.readLine().toInt()
        val array = Array(n){0}

        var sum = 0
        var maxCount = 0
        repeat(n){
            array[it] = br.readLine().toInt()
            sum += array[it]

            maxCount = max(maxCount, array[it])
        }

        var rankerIndex = 0
        var check = 0
        for(i in 0 until n){
            if(array[i] == maxCount){
                rankerIndex = i
                check++
            }
        }

        if(check > 1)
            bw.write("no winner\n")
        else if(maxCount > (sum/2))
            bw.write("majority winner ${rankerIndex+1}\n")
        else
            bw.write("minority winner ${rankerIndex+1}\n")

    }

    bw.close()
    br.close()
}