import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val friend = Array(n + 1){HashSet<Int>()}

    repeat(m){
        val (a, b) = br.readLine().split(" ").map { it.toInt() }

        friend[a].add(b)
        friend[b].add(a)
    }

    for(i in 1 .. n)
        bw.write("${friend[i].size}\n")

    br.close()
    bw.close()
}