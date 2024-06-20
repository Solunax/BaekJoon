import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (t1, t3) = br.readLine().split("=")
    val (m1, m2) = t1.split("+").map { getCount(it) }
    val m3 = getCount(t3)
    var result = ""

    for (i in 1..10) {
        for (j in 1..10) {
            for (k in 1..10) {
                if (m1[0] * i + m2[0] * j == m3[0] * k &&
                    m1[1] * i + m2[1] * j == m3[1] * k &&
                    m1[2] * i + m2[2] * j == m3[2] * k &&
                    result == ""
                ) {
                    result = "$i $j $k"
                }
            }
        }
    }
    bw.write(result)

    bw.close()
    br.close()
}

fun getCount(str: String): IntArray {
    val count = IntArray(3)
    val check = listOf('C', 'H', 'O')

    for (i in str.indices) {
        if (str[i] in check) {
            if (i < str.length - 1) {
                if (str[i + 1] in check) {
                    count[check.indexOf(str[i])] += 1
                } else {
                    count[check.indexOf(str[i])] += str[i + 1] - '0'
                }
            } else {
                count[check.indexOf(str[i])] += 1
            }
        }
    }

    return count
}