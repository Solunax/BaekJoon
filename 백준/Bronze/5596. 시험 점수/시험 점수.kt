import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val v1 = br.readLine().split(" ").map { it.toInt() }
    val v2 = br.readLine().split(" ").map { it.toInt() }

    var v1sum = 0
    var v2sum = 0

    for(i in v1.indices){
        v1sum += v1[i]
        v2sum += v2[i]
    }

    if(v1sum < v2sum)
        bw.write("$v2sum")
    else
        bw.write("$v1sum")

    bw.close()
    br.close()
}