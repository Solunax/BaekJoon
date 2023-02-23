import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val(candy, kids) = br.readLine().split(" ").map { it.toInt() }

        bw.write("You get ${candy / kids} piece(s) and your dad gets ${candy % kids} piece(s).\n")
    }

    br.close()
    bw.close()
}