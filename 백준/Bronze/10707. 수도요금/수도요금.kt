import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val xNormal = br.readLine().toInt()
    val yNormal = br.readLine().toInt()
    val yMax = br.readLine().toInt()
    val yExtra = br.readLine().toInt()
    val p = br.readLine().toInt()

    val xPay = xNormal * p
    val yPay = if(p <= yMax)
        yNormal
    else
        yNormal + (p - yMax) * yExtra

    bw.write("${min(xPay, yPay)}")

    bw.close()
    br.close()
}