import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val vowel = listOf('y', 'u', 'i', 'o', 'p', 'h', 'j', 'k', 'l', 'b', 'n', 'm')
    br.readLine()

    bw.write(
        when(br.readLine().last()){
                in vowel -> "0"
                else -> "1"
            }
    )

    bw.close()
    br.close()
}