import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        val (a, b, c, d) = br.readLine().split(" ").map { it.toInt() }

        if(a == 0 && b == 0 && c == 0 && d == 0)
            break

        bw.write("${c - b} ${d - a}\n")
    }

    br.close()
    bw.close()
}
