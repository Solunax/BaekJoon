import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val input = StringTokenizer(br.readLine())
        val n = input.nextToken().toInt()
        val arr = ArrayList<Int>()
        var sum = 0L

        repeat(n) {
            arr.add(input.nextToken().toInt())
        }


        for (i in 0 until n - 1) {
            for (j in i + 1 until n) {
                sum += gcd(arr[i], arr[j])
            }
        }

        bw.write("$sum\n")
    }

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