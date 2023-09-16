import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true){
        val input = br.readLine()

        if(input.isNullOrEmpty())
            break

        val sb = StringBuilder()

        input.forEach {
            when(it){
                'I' -> sb.append('E')
                'i' -> sb.append('e')
                'E' -> sb.append('I')
                'e' -> sb.append('i')
                else -> sb.append(it)
            }
        }

        bw.write("$sb\n")
    }

    bw.close()
    br.close()
}