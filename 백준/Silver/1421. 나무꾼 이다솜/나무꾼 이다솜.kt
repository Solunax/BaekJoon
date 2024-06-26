import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, c, w) = br.readLine().split(" ").map { it.toInt() }
    val wood = IntArray(n)
    var maxLen = 0

    repeat(n) {
        wood[it] = br.readLine().toInt()
        maxLen = max(wood[it], maxLen)
    }

    var result = 0L
    for (i in 1..maxLen) {
        var sum = 0L

        for (j in 0 until n) {
            if (wood[j] >= i) {
                val cut = wood[j] / i
                val cost = if (wood[j] % i == 0) {
                    wood[j] / i - 1
                } else {
                    wood[j] / i
                } * c

                val money = (cut * w * i) - cost
                if (money > 0) {
                    sum += money
                }
            }
        }

        result = max(result, sum)
    }

    bw.write("$result")

    bw.close()
    br.close()
}