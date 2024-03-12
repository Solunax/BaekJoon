import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var maxCount = 0
    var maxArr = ArrayList<Int>()

    for (i in n downTo 1) {
        val arr = ArrayList<Int>()
        var count = 2
        arr.add(n)
        arr.add(i)

        while (true) {
            val num = arr[arr.size - 2] - arr[arr.size - 1]

            if (num < 0) {
                if (maxCount < count) {
                    maxCount = count
                    maxArr = arr
                }
                break
            } else {
                arr.add(num)
                count++
            }
        }
    }

    bw.write("$maxCount\n${maxArr.joinToString(" ")}")

    bw.close()
    br.close()
}