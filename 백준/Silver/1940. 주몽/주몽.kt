import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val m = br.readLine().toInt()
    val material = br.readLine().split(" ").map { it.toInt() }.sorted()

    var count = 0

    for(i in 0 until n){
        var sum : Int
        var end = i + 1

        while(end < n){
            sum = material[i] + material[end++]
            if(sum == m){
                count++
                break
            }
        }
    }
    bw.write("$count")

    bw.close()
    br.close()
}
