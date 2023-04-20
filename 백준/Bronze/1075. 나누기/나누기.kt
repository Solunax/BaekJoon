import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine()
    val f = br.readLine().toInt()
    val v1 = n.substring(0, n.length - 2)
    var num = 0

    while(true){
        val temp = (v1 + "%02d".format(num)).toInt()

        if(temp % f == 0)
            break

        num++
    }

    bw.write("%02d".format(num))

    bw.close()
    br.close()
}