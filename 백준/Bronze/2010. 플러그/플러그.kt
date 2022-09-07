import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var plug = br.readLine().toInt()

    repeat(n-1){
        plug -= 1
        plug += br.readLine().toInt()
    }
    bw.write("$plug")

    bw.close()
    br.close()
}
