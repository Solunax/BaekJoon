import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val time = br.readLine().split(":").map { it.toInt() }
    var result = 0

    for(i in 0 until 3){
        for(j in 0 until 3){
            for(k in 0 until 3){
                if(i != j && j != k && i != k){
                    if(time[i] in 1 .. 12 && time[j] in 0 .. 59 && time[k] in 0 .. 59)
                        result++
                }
            }
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}