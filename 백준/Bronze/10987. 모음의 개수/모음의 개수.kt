import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val vowel = listOf('a', 'e' ,'i', 'o', 'u')
    val input = br.readLine()
    var count = 0

    input.forEach {
        if(it in vowel)
            count++
    }
    bw.write("$count")
    
    br.close()
    bw.close()
}