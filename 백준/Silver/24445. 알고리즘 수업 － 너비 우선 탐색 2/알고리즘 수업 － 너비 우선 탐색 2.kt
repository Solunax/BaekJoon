import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m, r) = br.readLine().split(" ").map { it.toInt() }
    val visited = Array(n+1){0}
    val graph =  Array(n + 1){ ArrayList<Int>() }

    repeat(m){
        val (v1, v2) = br.readLine().split(" ").map { it.toInt() }

        graph[v1].add(v2)
        graph[v2].add(v1)
    }

    graph.forEach {
        it.sortDescending()
    }

    bfs(r, graph, visited)

    for(i in 1 until visited.size){
        bw.write("${visited[i]}\n")
    }

    bw.close()
    br.close()
}

fun bfs(start : Int, graph : Array<ArrayList<Int>>, visited : Array<Int>){
    val queue = LinkedList<Int>()
    var count = 1

    queue.offer(start)
    visited[start] = count

    while (queue.isNotEmpty()){
        val index = queue.poll()

        for(i in 0 until graph[index].size){
            val temp = graph[index][i]

            if(visited[temp] != 0)
                continue

            visited[temp] = ++count
            queue.offer(temp)
        }
    }
}