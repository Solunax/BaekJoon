import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val num = HashMap<Int, Int>()
    var sum = 0

    repeat(10){
        val n = br.readLine().toInt()
        sum += n

        if(num.containsKey(n))
            num[n] = num[n]!! + 1
        else
            num[n] = 1
    }

    val list = num.toList().sortedByDescending {
        it.second
    }

    bw.write("${sum / 10}\n")
    bw.write("${list[0].first}")


    br.close()
    bw.close()
}