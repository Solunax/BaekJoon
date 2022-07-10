import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue
import kotlin.math.abs
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b, c, m) = br.readLine().split(" ").map { it.toInt() }

    var now = 0
    var work = 0
    if(a > m)
        bw.write("0")
    else{
        for(i in 1 .. 24){
            if(m >= now + a){
                work += b
                now += a
            }else{
                now -= c
                if(now < 0)
                    now = 0
            }
        }

        bw.write("$work")
    }
    
    bw.close()
    br.close()
}