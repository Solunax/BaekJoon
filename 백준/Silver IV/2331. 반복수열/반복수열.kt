import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, p) = br.readLine().split(" ").map { it.toInt() }
    val array = ArrayList<Int>()
    var num = a
    array.add(a)

    while (true) {
        var sum = 0

        while (num != 0) {
            sum += (num % 10).toDouble().pow(p).toInt()
            num /= 10
        }

        if (array.contains(sum)) {
            bw.write("${array.indexOf(sum)}")
            break
        } else {
            num = sum
            array.add(num)
        }
    }

    bw.close()
    br.close()
}