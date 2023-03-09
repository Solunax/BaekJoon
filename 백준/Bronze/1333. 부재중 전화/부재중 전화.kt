import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, l, d) = br.readLine().split(" ").map { it.toInt() }

    var time = 0
    var ring = d
    for(i in 0 until n){
        time += l

        while(time > ring){
            ring += d
        }

        if(ring >= time - 1 && ring <= time + 4)
            break

        time += 5
    }
    bw.write("$ring")

    br.close()
    bw.close()
}