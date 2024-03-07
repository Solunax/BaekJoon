import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val arr = ArrayList<Int>()
    var result = 0

    while (true) {
        val input = br.readLine()

        if (input.isNullOrEmpty()) {
            break
        }

        val st = StringTokenizer(input, " ")

        while (st.hasMoreTokens()) {
            arr.add(st.nextToken().toInt())
        }
    }

    for (i in 0 until arr.size - 1) {
        for (j in i + 1 until arr.size) {
            result = max(result, gcd(arr[i], arr[j]))
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}

fun gcd(v1: Int, v2: Int): Int {
    return if (v2 == 0) {
        v1
    } else {
        gcd(v2, v1 % v2)
    }
}