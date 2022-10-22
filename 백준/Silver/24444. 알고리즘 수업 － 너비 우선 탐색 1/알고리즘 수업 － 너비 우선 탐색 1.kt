import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m, r) = br.readLine().split(" ").map{ it.toInt() }
    val visited = Array(n+1){0}
    val graph = Array(n+1){ArrayList<Int>()}

    repeat(m){
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }

    graph.forEach {
        it.sort()
    }

    bfs(r, graph, visited)

    for(i in 1 .. n)
        bw.write("${visited[i]}\n")

    bw.close()
    br.close()
}

fun bfs(start : Int, graph:Array<ArrayList<Int>>, visited : Array<Int>){
    val queue : Queue<Int> = LinkedList()
    queue.offer(start)
    var count = 1

    visited[start] = count++

    while(queue.isNotEmpty()){
        val node = queue.poll()
        for(i in 0 until graph[node].size){
            val temp = graph[node][i]

            if(visited[temp] != 0)
                continue

            visited[temp] = count++
            queue.offer(temp)
        }
    }
}