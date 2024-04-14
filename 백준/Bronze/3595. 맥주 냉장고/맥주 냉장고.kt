import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var min = Int.MAX_VALUE
    val result = IntArray(3)

    for (i in 1..n) {
        for (j in 1..i) {
            if (i * j > n) {
                break
            }

            for (k in 1..j) {
                if (i * j * k > n) {
                    break
                }

                if (i * j * k == n) {
                    val size = (i * j * 2) + (i * k * 2) + (j * k * 2)

                    if (size < min) {
                        min = size
                        result[0] = i
                        result[1] = j
                        result[2] = k
                    }
                }
            }
        }
    }
    bw.write(result.joinToString(" "))

    bw.close()
    br.close()
}