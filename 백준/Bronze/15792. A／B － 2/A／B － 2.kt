import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (v1, v2) = br.readLine().split(" ").map { it.toInt() }

    bw.write("${v1 / v2}.")
    v1 %= v2

    for(i in 0 until 1000){
        v1 *= 10

        if(v1 == 0)
            break

        bw.write("${v1 / v2}")
        v1 %= v2
    }

    bw.close()
    br.close()
}