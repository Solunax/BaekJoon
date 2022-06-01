import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

val n = br.readLine().toInt()
val tree = Array(n + 1) { LinkedList<Int>() }
val parent = Array(n + 1) { 0 }
val visit = Array(n + 1) { false }

fun main() {
    for(i in 0 until n - 1){
        val (v1, v2) = br.readLine().split(" ").map { it.toInt() }
        tree[v1].add(v2)
        tree[v2].add(v1)
    }
    dfs(1)
    for(i in 2 .. n)
        bw.write("${parent[i]}\n")

    bw.close()
    br.close()
}

fun dfs(r:Int){
    visit[r] = true
    tree[r].forEach {
        if(!visit[it]){
            parent[it] = r
            dfs(it)
        }
    }
}