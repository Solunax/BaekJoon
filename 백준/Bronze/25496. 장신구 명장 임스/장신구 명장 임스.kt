import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (p, _) = br.readLine().split(" ").map{ it.toInt() }
    val array = br.readLine().split(" ").map { it.toInt() }.sorted()

    var result = 0
    for(i in array.indices){
        if(p < 200){
            result++
            p += array[i]
        }
    }

    bw.write("$result")
    bw.close()
    br.close()
}