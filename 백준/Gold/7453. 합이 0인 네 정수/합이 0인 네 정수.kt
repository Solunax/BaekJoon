import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = Array(4) { LongArray(n) }
    val ab = LongArray(n * n)
    val cd = LongArray(n * n)

    for (i in 0 until n) {
        val input = StringTokenizer(br.readLine())

        repeat(4) {
            arr[it][i] = input.nextToken().toLong()
        }
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            ab[i * n + j] = arr[0][i] + arr[1][j]
            cd[i * n + j] = arr[2][i] + arr[3][j]
        }
    }

    ab.sort()
    cd.sort()

    var start = 0
    var end = n * n - 1
    var count = 0L

    while (start < n * n && end >= 0) {
        val abv = ab[start]
        val cdv = cd[end]
        val sum = abv + cdv

        if (sum < 0) {
            start++
        } else if (sum > 0) {
            end--
        } else {
            var v1 = 0L
            var v2 = 0L

            while (start < n * n && abv == ab[start]) {
                start++
                v1++
            }

            while (end >= 0 && cdv == cd[end]) {
                end--
                v2++
            }
            count += v1 * v2
        }
    }
    bw.write("$count")

    bw.close()
    br.close()
}