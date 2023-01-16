import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val input = br.readLine()
        val set = HashSet<Char>()

        input.forEach {
            set.add(it)
        }
        
        bw.write("${set.size}\n")
    }

    br.close()
    bw.close()
}