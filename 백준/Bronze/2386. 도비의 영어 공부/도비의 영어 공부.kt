import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true){
        val input = br.readLine()
        val search = input.substring(0, 1)[0]

        if(search == '#')
            break

        val string = input.substring(2)
        var count = 0

        string.forEach {
            if(it == search || it.code == search.code-32)
                count++
        }

        bw.write("$search $count\n")
    }

    bw.close()
    br.close()
}