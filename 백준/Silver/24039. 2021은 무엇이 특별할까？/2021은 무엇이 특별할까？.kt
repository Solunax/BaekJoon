import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
const val MAX = 120
var prime = ArrayList<Int>()
val primeCheck = BooleanArray(MAX + 1) { true }

fun main() {
    getPrime()
    val input = br.readLine().toInt()

    for (i in 0 until prime.size - 1) {
        if (prime[i] * prime[i + 1] > input) {
            bw.write("${prime[i] * prime[i + 1]}")
            break
        }
    }

    bw.close()
    br.close()
}

fun getPrime() {
    primeCheck[0] = false
    primeCheck[1] = false

    for (i in 2..MAX) {
        if (primeCheck[i]) {
            prime.add(i)
            for (j in i * i..MAX step i) {
                primeCheck[j] = false
            }
        }
    }
}