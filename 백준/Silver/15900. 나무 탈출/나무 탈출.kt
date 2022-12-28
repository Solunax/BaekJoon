import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

val n = br.readLine().toInt()
val node = Array(n+1){ArrayList<Int>()}
var total = 0
fun main() {


    repeat(n-1){
        val (v1, v2) = br.readLine().split(" ").map { it.toInt() }
        node[v1].add(v2)
        node[v2].add(v1)
    }

    val visited = Array(n+1){false}
    dfs(1, 0, visited)

    when(total%2){
        0 -> bw.write("No")
        else -> bw.write("Yes")
    }

    br.close()
    bw.close()
}

fun dfs(index : Int, count : Int, visited : Array<Boolean>){
    visited[index] = true

    for(i in node[index]){
        if(!visited[i])
            dfs(i, count+1, visited)
    }

    if(index != 1 && node[index].size == 1)
        total += count
}