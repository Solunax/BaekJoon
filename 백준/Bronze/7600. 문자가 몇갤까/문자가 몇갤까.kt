import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        val input = br.readLine().uppercase()

        if(input == "#")
            break

        val count = HashSet<Char>()
        input.forEach {
            if(it in 'A' .. 'Z')
                count.add(it)
        }

        bw.write("${count.size}\n")
    }

    br.close()
    bw.close()
}