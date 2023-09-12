import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val map = HashMap<String, Int>()

    val (n, s) = br.readLine().split(" ")

    for(i in 0 until n.toInt()) {
        val (name, answer) = br.readLine().split(" ")

        if (name == s){
            bw.write("${map[answer] ?: 0}")
            break
        }

        if (!map.containsKey(answer))
            map[answer] = 1
        else
            map[answer] = map[answer]!! + 1
    }

    bw.close()
    br.close()
}