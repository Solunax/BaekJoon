import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val stamp = br.readLine().toInt()
    val price = br.readLine().toInt()

    var result = price

    for(i in 1 ..  4){
        if(i * 5 > stamp)
            break

        result = when(i){
            1 -> min(result, price - 500)
            2 -> min(result, (price * 0.9).toInt())
            3 -> min(result, price - 2000)
            4 -> min(result, (price * 0.75).toInt())
            else -> result
        }
    }

    if(result < 0)
        result = 0

    bw.write("$result")

    br.close()
    bw.close()
}