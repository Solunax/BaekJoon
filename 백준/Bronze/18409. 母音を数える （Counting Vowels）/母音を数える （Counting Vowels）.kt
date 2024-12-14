import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val vowel = listOf('a', 'e', 'i', 'o', 'u')
    br.readLine()
    bw.write("${br.readLine().count { vowel.contains(it) }}")

    bw.close()
    br.close()
}