import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toLong()
    var sum = 1L

    for(i in 2 .. n)
        sum *= i

    val week = (7 * 24 * 60 * 60).toLong()
    var count = 1L

    while (true){
        if(week * count == sum)
            break
        else
            count++
    }
    bw.write("$count")

    bw.close()
    br.close()
}