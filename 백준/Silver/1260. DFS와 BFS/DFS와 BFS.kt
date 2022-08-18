import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m ,v) = br.readLine().split(" ").map { it.toInt() }
    val tree = Array(n + 1){ Array(n+1){0} }
    val check = Array(n + 1){0}

    repeat(m){
        val (v1,v2) = br.readLine().split(" ").map { it.toInt() }
        tree[v1][v2] = 1
        tree[v2][v1] = 1
    }

    dfs(v, n, tree, check)

    for(i in 0 .. n)
        check[i] = 0

    bw.write("\n")
    bfs(v, n, tree, check)

    bw.close()
    br.close()
}

fun dfs(start : Int, nodeCount : Int, tree : Array<Array<Int>>, check : Array<Int>){
    check[start] = 1
    bw.write("$start ")

    for(i in 1 .. nodeCount){
        if(tree[start][i] == 1 && check[i] != 1)
            dfs(i, nodeCount, tree, check)
    }
}

fun bfs(start : Int, nodeCount : Int, tree : Array<Array<Int>>, check : Array<Int>){
    val queue = LinkedList<Int>()
    queue.add(start)
    check[start] = 1

    while (queue.isNotEmpty()){
        val v = queue.poll()
        bw.write("$v ")

        for(i in 1 .. nodeCount){
            if(tree[v][i] == 1 && check[i] != 1){
                queue.add(i)
                check[i] = 1
            }
        }
    }
}
