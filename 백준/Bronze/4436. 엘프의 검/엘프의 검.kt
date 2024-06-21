import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true) {
        val input = br.readLine()

        if (input.isNullOrEmpty()) {
            break
        }

        val n = input.toInt()
        var num = 0L
        var k = 0
        var count = 10
        val check = BooleanArray(10)

        while (count != 0) {
            k++
            num += n

            for (c in num.toString()) {
                if (!check[c - '0']) {
                    check[c - '0'] = true
                    count--

                    if (count == 0) {
                        break
                    }
                }
            }
        }

        bw.write("$k\n")
    }

    bw.close()
    br.close()
}