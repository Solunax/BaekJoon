import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val k = br.readLine().toInt()

    repeat(br.readLine().toInt()){
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        val diff = abs(a - b)
        val remain = k - max(a, b)

        if(a == b)
            bw.write("1\n")
        else if(a < b){
            if(diff - remain <= 1)
                bw.write("1\n")
            else
                bw.write("0\n")
        }else{
            if(diff - remain <= 2)
                bw.write("1\n")
            else
                bw.write("0\n")
        }
    }

    bw.close()
    br.close()
}