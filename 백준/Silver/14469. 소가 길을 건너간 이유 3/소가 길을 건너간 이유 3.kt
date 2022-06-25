import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val numberOfCow = br.readLine().toInt()
    val cows = Array(numberOfCow){Array(2){ 0 } }

    for(i in 0 until numberOfCow)
        cows[i] = br.readLine().split(" ").map { it.toInt() }.toTypedArray()

    cows.sortWith { o1, o2 -> o1[0] - o2[0] }

    var sum = cows[0][0] + cows[0][1]

    for(i in 1 until numberOfCow){
        if(sum < cows[i][0])
            sum = cows[i][0] + cows[i][1]
        else
            sum += cows[i][1]
    }

    bw.write("$sum")

    bw.close()
    br.close()
}