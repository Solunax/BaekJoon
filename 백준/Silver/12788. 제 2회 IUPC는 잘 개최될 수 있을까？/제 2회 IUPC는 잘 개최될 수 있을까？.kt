import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val (team, p) = br.readLine().split(" ").map { it.toInt() }
    val pen = br.readLine().split(" ").map { it.toInt() }.sortedDescending()

    var count = 0
    var found = false
    var total = team * p
    for(i in pen.indices){
        total -= pen[i]
        count++

        if(total <= 0){
            found = true
            break
        }
    }

    if(found)
        bw.write("$count")
    else
        bw.write("STRESS")

    bw.close()
    br.close()
}