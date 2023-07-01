import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val soup = Array(3){0}

    repeat(3){
        soup[it] = br.readLine().toInt()
    }

    bw.write("${soup.sorted()[1]}")

    bw.close()
    br.close()
}