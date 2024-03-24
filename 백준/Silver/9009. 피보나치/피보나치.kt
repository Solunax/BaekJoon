import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val fibo = getFibonacci()

    repeat(br.readLine().toInt()) {
        var n = br.readLine().toInt()
        val result = ArrayList<Int>()

        for (i in fibo.size - 1 downTo 0) {
            if (n == 0) {
                break
            }

            if (n >= fibo[i]) {
                result.add(fibo[i])
                n -= fibo[i]
            }
        }

        result.sort()
        bw.write("${result.joinToString(" ")}\n")
    }

    bw.close()
    br.close()
}

fun getFibonacci(): ArrayList<Int> {
    val fibo = ArrayList<Int>()
    var sum: Int
    fibo.add(0)
    fibo.add(1)

    while (true) {
        sum = fibo[fibo.size - 1] + fibo[fibo.size - 2]

        if (sum <= 1000000000) {
            fibo.add(sum)
        } else {
            break
        }
    }

    return fibo
}