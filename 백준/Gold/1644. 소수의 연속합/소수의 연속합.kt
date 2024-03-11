import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val n = br.readLine().toInt()

fun main() {
    val prime = getPrime(n)
    var start = 0
    var end = 0
    var result = 0
    var sum = 0

    while (start <= end && end < prime.size) {
        if (sum <= n) {
            if (sum == n) {
                result++
            }

            sum += prime[end++]
        } else {
            sum -= prime[start++]
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}

fun getPrime(n: Int): ArrayList<Int> {
    val arr = Array(n + 1) { true }
    val prime = ArrayList<Int>()
    arr[0] = false
    arr[1] = false

    for (i in 2..n) {
        if (arr[i]) {
            for (j in i + i..n step i) {
                arr[j] = false
            }
        }
    }

    for (i in 0..n) {
        if (arr[i]) {
            prime.add(i)
        }
    }

    prime.add(0)

    return prime
}