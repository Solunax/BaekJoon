import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var bomb = br.readLine().toInt()
    var time = 0

    for(i in 0 until br.readLine().toInt()){
        val (delay, answer) = br.readLine().split(" ")

        time += delay.toInt()
        if(time >= 210)
            break

        if(answer == "T")
            bomb++

        if(bomb > 8)
            bomb = 1
    }
    bw.write("$bomb")

    bw.close()
    br.close()
}