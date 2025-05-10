import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
const val MAX = 10000001
val prime = BooleanArray(MAX) { true }

fun main() {
    val (before, add) = br.readLine().split(" ")
    getPrime()

    if (prime[before.toInt()] && prime[(add + before).toInt()]) {
        bw.write("Yes")
    } else {
        bw.write("No")
    }

    bw.close()
    br.close()
}

fun getPrime() {
    prime[0] = false
    prime[1] = false

    for (i in 2..sqrt(MAX.toDouble()).toInt()) {
        if (prime[i]) {
            for (j in i * i until MAX step i) {
                prime[j] = false
            }
        }
    }
}