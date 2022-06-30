import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.min
import java.lang.Integer.numberOfTrailingZeros
import java.util.LinkedList
import kotlin.math.abs
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val asc = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    val desc = arrayOf(8, 7, 6, 5, 4, 3, 2, 1)

    val input = br.readLine().split(" ").map { it.toInt() }
    var flag = true

    if(input[0] == 1){
        for(i in 1 until  8){
            if(asc[i] != input[i]){
                flag = false
                break
            }
        }
        if(flag)
            bw.write("ascending")
        else
            bw.write("mixed")

    }else if(input[0] == 8){
        for(i in 7 downTo 1){
            if(desc[i] != input[i]){
                flag = false
                break
            }
        }
        if(flag)
            bw.write("descending")
        else
            bw.write("mixed")
    }else
        bw.write("mixed")

    bw.close()
    br.close()
}