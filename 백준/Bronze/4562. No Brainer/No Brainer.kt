import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val (x, y) = br.readLine().split(" ").map { it.toInt() }

        if (x < y)
            bw.write("NO BRAINS\n")
        else
            bw.write("MMM BRAINS\n")
    }

    bw.close()
    br.close()
}