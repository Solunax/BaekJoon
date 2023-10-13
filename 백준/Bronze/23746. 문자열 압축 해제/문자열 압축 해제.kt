import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val pattern = HashMap<String, String>()

    repeat(br.readLine().toInt()){
        val (small, large) = br.readLine().split(" ")

        pattern[large] = small
    }

    val str = br.readLine()
    val sb = StringBuilder()

    str.forEach {
        sb.append("${pattern[it.toString()]}")
    }

    val (s, e) = br.readLine().split(" ").map { it.toInt() - 1 }

    for(i in s .. e)
        bw.write("${sb[i]}")

    bw.close()
    br.close()
}