import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val times = br.readLine().split(" ").map { it.toInt() }.toMutableList()
    val d = br.readLine().toInt()

    times[2] += d
    for(i in 2 downTo 1){
        if(times[i] >= 60){
            times[i - 1] += times[i] / 60
            times[i] %= 60
        }
    }

    if(times[0] >= 24)
        times[0] %= 24

    times.forEach {
        bw.write("$it ")
    }

    bw.close()
    br.close()
}