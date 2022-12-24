import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var seq = 0

fun main() {
    val (n, m, r) = br.readLine().split(" ").map{ it.toInt() }
    val node = Array(n+1){ArrayList<Int>()}
    val result = Array(n+1){0}

    for(i in 1 .. n)
        node[i] = ArrayList()

    repeat(m){
        val input = br.readLine().split(" ").map { it.toInt() }
        node[input[0]].add(input[1])
        node[input[1]].add(input[0])
    }

    for(i in 1 .. n)
        node[i].sortDescending()

    val visited = Array(n+1){false}
    dfs(r, node, visited, result)

    for(i in 1 .. n)
        bw.write("${result[i]}\n")

    br.close()
    bw.close()
}

fun dfs(now : Int, node : Array<ArrayList<Int>>, visited : Array<Boolean>, result : Array<Int>){
    visited[now] = true
    result[now] = ++seq

    for(i in node[now]){
        if(visited[i])
            continue
        else
            dfs(i, node, visited, result)
    }
}