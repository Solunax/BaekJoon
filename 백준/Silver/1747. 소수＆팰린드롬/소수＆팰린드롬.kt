import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
const val MAX = 2000000
val prime = Array(MAX + 1) { true }

fun main() {
    val input = br.readLine().toInt()
    getPrime()

    for (i in input..MAX) {
        if (input < 10 && prime[i]) {
            bw.write("$i")
            break
        }

        if (prime[i] && palindromeCheck(i.toString())) {
            bw.write("$i")
            break
        }
    }

    bw.close()
    br.close()
}

fun getPrime() {
    prime[0] = false
    prime[1] = false

    var i = 2
    while (i * i <= MAX) {
        if (prime[i]) {
            for (j in i * i..MAX step i) {
                prime[j] = false
            }
        }

        i++
    }
}

fun palindromeCheck(str: String): Boolean {
    val half = str.length / 2

    for (i in 0 until half) {
        if (str[i] != str[str.length - i - 1]) {
            return false
        }
    }

    return true
}