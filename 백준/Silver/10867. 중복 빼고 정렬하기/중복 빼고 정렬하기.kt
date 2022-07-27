import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val set = HashSet<Int>(br.readLine().split(" ").map{ it.toInt() })
    set.sorted().forEach {
        bw.write("$it ")
    }
    bw.close()
    br.close()
}