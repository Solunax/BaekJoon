import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val factorial = LongArray(21)

fun main() {
    getFactorial()
    val n = br.readLine().toLong()

    if (n == 0L) {
        bw.write("NO")
    } else {
        if (divide(n)) {
            bw.write("YES")
        } else {
            bw.write("NO")
        }
    }

    bw.close()
    br.close()
}

fun getFactorial() {
    factorial[0] = 1
    for (i in 1..20) {
        factorial[i] = factorial[i - 1] * i
    }
}

fun divide(n: Long): Boolean {
    var num = n
    for (i in 20 downTo 0) {
        if (num >= factorial[i]) {
            num -= factorial[i]
        }
    }

    return num == 0L
}