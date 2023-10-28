import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (n, pitch) = br.readLine().split(" ").map { it.toInt() }
    val maxPitch = br.readLine().split(" ").map { it.toInt() }
    var index = 0

    while (true) {
        if(maxPitch[index] < pitch){
            bw.write("${index + 1}")
            break
        }

        index++
        pitch++

        if(index >= n)
            index = 0
    }


    bw.close()
    br.close()
}