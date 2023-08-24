import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()

    val set = HashSet<String>()
    br.readLine().split(" ").forEach {
        if(it.endsWith("Cheese"))
            set.add(it)
    }

    if(set.size >= 4)
        bw.write("yummy")
    else
        bw.write("sad")

    bw.close()
    br.close()
}