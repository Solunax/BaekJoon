import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = ArrayList<Array<Int>>()

    var sum = 2
    var count = 0

    while (count < n){
        for(i in sum - 1 downTo 1){
            arr.add(arrayOf(i, sum - i))
            count++
        }

        sum++
    }

    bw.write("${arr[n - 1][0]} ${arr[n - 1][1]}")

    bw.close()
    br.close()
}