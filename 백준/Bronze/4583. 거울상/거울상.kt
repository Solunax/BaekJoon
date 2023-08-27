import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val mirror = listOf('b', 'd', 'p', 'q', 'i', 'o', 'v', 'w', 'x')

    while (true){
        val input = br.readLine()

        if(input == "#")
            break

        var check = true
        input.forEach {
            if(it !in mirror)
                check = false
        }


        if (check){
            val sb = StringBuilder()

            input.forEach {
                when(it){
                    'b' -> sb.append('d')
                    'd' -> sb.append('b')
                    'p' -> sb.append('q')
                    'q' -> sb.append('p')
                    else -> sb.append("$it")
                }
            }

            bw.write("${sb.reverse()}\n")
        } else
            bw.write("INVALID\n")
    }

    bw.close()
    br.close()
}