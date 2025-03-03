import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val str = br.readLine().toCharArray()

    for (i in 0 until n) {
        when (str[i]) {
            'I' -> str[i] = 'i'
            'l' -> str[i] = 'L'
        }
    }
    bw.write(str.joinToString(""))

    bw.close()
    br.close()
}