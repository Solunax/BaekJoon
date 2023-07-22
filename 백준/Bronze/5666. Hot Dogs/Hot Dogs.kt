import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true){
        val input = br.readLine()

        if(input.isNullOrEmpty())
            break

        val (h, p) = input.split(" ").map { it.toDouble() }

        bw.write("%.2f\n".format(h / p))
    }

    bw.close()
    br.close()
}