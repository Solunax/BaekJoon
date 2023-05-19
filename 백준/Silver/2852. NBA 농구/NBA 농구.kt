import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var t1 = 0
    var t2 = 0
    var win = 0
    var time = 0

    repeat(br.readLine().toInt()){
        val (team, goalTime) = br.readLine().split(" ")
        val t = goalTime.split(":").map { it.toInt() }
        val temp = t[0] * 60 + t[1]

        if(win != 0){
            if(win > 0)
                t1 += temp - time
            else
                t2 += temp - time
        }

        when(team){
            "1" -> win++
            "2" -> win--
        }

        time = temp
    }

    val temp = 48 * 60 - time

    if(win != 0){
        if(win > 0)
            t1 += temp
        else
            t2 += temp
    }

    bw.write("%02d:%02d\n%02d:%02d".format(t1 / 60, t1 % 60, t2 / 60, t2 % 60))

    bw.close()
    br.close()
}