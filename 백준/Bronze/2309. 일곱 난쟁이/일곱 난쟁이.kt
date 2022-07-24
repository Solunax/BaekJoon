import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.max
import kotlin.math.round

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()


fun main() {
    val array = Array(9){ 0 }

    var sum = 0
    for(i in 0 until 9){
        array[i] = br.readLine().toInt()
        sum += array[i]
    }
    array.sort()
    var a = 0
    var b = 0

    for(i in 0 until 9){
        for(j in i + 1 until  9){
            if(sum - array[i] - array[j] == 100){
                a = i
                b = j
                break
            }
        }
    }

    for(i in 0 until 9){
        if(i == a || i == b)
            continue
        else
            bw.write("${array[i]}\n")
    }

    bw.close()
    br.close()
}