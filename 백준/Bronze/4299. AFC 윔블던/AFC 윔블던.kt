import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (sum, sub) = br.readLine().split(" ").map { it.toInt() }

    if((sum+sub) % 2 != 0 || sum < sub)
        bw.write("-1")
    else{
        val x = (sum+sub) / 2
        val y = sum - x

        if(x < 0 || y < 0)
            bw.write("-1")
        else
            bw.write("${max(x, y)} ${min(x, y)}")
    }


    bw.close()
    br.close()
}