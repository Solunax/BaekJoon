import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(3){
        val time = br.readLine().split(" ").map { it.toInt() }
        var h = time[3] - time[0]
        var m = time[4] - time[1]
        var s = time[5] - time[2]

        if(s < 0){
            s += 60
            m -= 1
        }

        if(m < 0){
            m += 60
            h -= 1
        }

        bw.write("$h $m $s\n")
    }

    bw.close()
    br.close()
}