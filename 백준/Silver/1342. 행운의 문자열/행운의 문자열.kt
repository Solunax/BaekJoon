import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val alpha = IntArray(26)
var result = 0

fun main() {
    val str = br.readLine()

    str.forEach {
        alpha[it - 'a']++
    }

    search(0, "", str.length)
    bw.write("$result")

    bw.close()
    br.close()
}

fun search(index: Int, str: String, len: Int) {
    if (index == len) {
        result++
        return
    }

    for (i in 0 until 26) {
        if (alpha[i] == 0) {
            continue
        }

        if (str.isNotEmpty() && str.last() == 'a' + i) {
            continue
        }

        alpha[i]--
        search(index + 1, str + ('a' + i), len)
        alpha[i]++
    }
}