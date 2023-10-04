import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val m = br.readLine().toInt()

    val graph = Array(n + 1){ ArrayList<Int>()}
    repeat(m){
        val (a, b) = br.readLine().split(" ").map { it.toInt() }

        graph[a].add(b)
        graph[b].add(a)
    }

    val result = HashSet<Int>()
    for(i in 0 until graph[1].size){
        result.add(graph[1][i])

        graph[graph[1][i]].forEach { v ->
            result.add(v)
        }
    }
    result.remove(1)

    bw.write("${result.size}")

    bw.close()
    br.close()
}