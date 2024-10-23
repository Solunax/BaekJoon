import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val prime = ArrayList<Int>()
val primeArray = BooleanArray(1001) { true }

fun main() {
    getPrime()

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        var check = false
        var result = ""

        for (i in 0 until prime.size) {
            if (check) {
                break
            }
            for (j in 0 until prime.size) {
                if (check) {
                    break
                }
                for (k in 0 until prime.size) {
                    if (check) {
                        break
                    }

                    if (prime[i] + prime[j] + prime[k] == n) {
                        check = true
                        result = "${prime[i]} ${prime[j]} ${prime[k]}"
                    }
                }
            }
        }

        if (check) {
            bw.write("$result\n")
        } else {
            bw.write("0\n")
        }
    }

    bw.close()
    br.close()
}

fun getPrime() {
    primeArray[0] = false
    primeArray[1] = false

    for (i in 2..sqrt(1000.0).toInt()) {
        if (primeArray[i]) {
            for (j in i * i..1000 step i) {
                primeArray[j] = false
            }
        }
    }

    for (i in 2..1000) {
        if (primeArray[i]) {
            prime.add(i)
        }
    }
}