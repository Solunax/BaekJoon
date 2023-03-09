import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var num = Integer.toBinaryString(br.readLine().toInt())
    num = num.reversed()

    var v = 1
    var sum = 0

    for(i in num.length - 1 downTo 0){
        if(num[i] == '1')
            sum += v

        v *= 2
    }

    bw.write("$sum")

    br.close()
    bw.close()
}