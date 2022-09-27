import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val k = br.readLine().toInt()

    if(k > n)
        bw.write("0")
    else{
        val sensor = br.readLine().split(" ").map { it.toInt() }.sorted()
        val diff = Array(n-1){0}

        for(i in 0 until n-1)
            diff[i] = sensor[i+1] - sensor[i]

        diff.sort()
        var result = 0
        for(i in 0 until n-k)
            result += diff[i]

        bw.write("$result")
    }

    bw.close()
    br.close()
}