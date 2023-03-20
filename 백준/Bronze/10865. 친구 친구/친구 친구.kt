import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val result = Array(n + 1){0}

    repeat(m){
        br.readLine().split(" ").map { it.toInt() }.forEach {
            result[it]++
        }
    }

    for(i in 1 .. n)
        bw.write("${result[i]}\n")

    br.close()
    bw.close()
}
