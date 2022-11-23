import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val set = HashSet<String>()
    val sb = StringBuilder()
    repeat(br.readLine().toInt()){
        br.readLine().split("").filter { it.isNotEmpty() }.sorted().forEach {
            sb.append(it)
        }
        set.add(sb.toString())
        sb.clear()
    }
    bw.write("${set.size}")

    bw.close()
    br.close()
}