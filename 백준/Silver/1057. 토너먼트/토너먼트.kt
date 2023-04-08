import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (_, kim, lim) = br.readLine().split(" ").map { it.toInt() }
    var result = 0

    while(kim != lim){
        if(kim % 2 == 0)
            kim /= 2
        else
            kim = kim / 2 + 1

        if(lim % 2 == 0)
            lim /= 2
        else
            lim = lim / 2 + 1

        result++
    }

    bw.write("$result")

    br.close()
    bw.close()
}