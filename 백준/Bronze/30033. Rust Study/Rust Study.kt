import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val plan = br.readLine().split(" ").map { it.toInt() }
    val study = br.readLine().split(" ").map { it.toInt() }
    var count = 0

    repeat(n){
        if(study[it] >= plan[it])
            count++
    }

    bw.write("$count")

    bw.close()
    br.close()
}