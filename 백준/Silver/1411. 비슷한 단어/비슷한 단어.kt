import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val str = Array(n) { "" }
    var result = 0

    repeat(n) {
        str[it] = br.readLine()
    }

    for (i in 0 until n) {
        for (j in i + 1 until n) {
            result += checkString(str[i], str[j])
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}

fun checkString(v1: String, v2: String): Int {
    val visit1 = IntArray(26) { -1 }
    val visit2 = IntArray(26) { -1 }

    for (i in v1.indices) {
        if (visit1[v1[i] - 'a'] == -1) {
            if (visit2[v2[i] - 'a'] != -1) {
                return 0
            }

            visit1[v1[i] - 'a'] = v2[i] - 'a'
            visit2[v2[i] - 'a'] = v1[i] - 'a'
        } else {
            if (visit1[v1[i] - 'a'] != v2[i] - 'a') {
                return 0
            }
        }
    }

    return 1
}