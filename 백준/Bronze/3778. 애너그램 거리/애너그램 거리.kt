import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) { idx ->
        val str1 = br.readLine()
        val str2 = br.readLine()

        val arr1 = Array(26){0}
        val arr2 = Array(26){0}

        str1.forEach {
            arr1[it - 'a']++
        }

        str2.forEach {
            arr2[it - 'a']++
        }

        var result = 0
        for (i in 0 until 26) {
            if (arr1[i] != 0 || arr2[i] != 0) {
               result += abs(arr1[i] - arr2[i])
            }
        }

        bw.write("Case #${idx + 1}: $result\n")
    }

    bw.close()
    br.close()
}