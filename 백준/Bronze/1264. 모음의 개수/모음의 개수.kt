import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val vowel = listOf('A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u')
    while (true){
        val input = br.readLine()

        if(input == "#")
            break

        var count = 0
        input.forEach {
            if(vowel.contains(it))
                count++
        }

        bw.write("$count\n")
    }

    bw.close()
    br.close()
}