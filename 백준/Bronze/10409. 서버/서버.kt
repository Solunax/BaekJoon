import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, t) = br.readLine().split(" ").map { it.toInt() }
    val task = br.readLine().split(" ").map { it.toInt() }
    var sum = 0
    var result = 0

    for(i in 0 until n){
        if(sum + task[i] <= t){
            sum += task[i]
            result++
        }else
            break
    }
    bw.write("$result")

    bw.close()
    br.close()
}