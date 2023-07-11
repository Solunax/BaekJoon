import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val dx = listOf(0, 1, 0, -1)
val dy = listOf(-1, 0, 1, 0)
lateinit var maze : Array<Array<Int>>
lateinit var visited : Array<Array<Boolean>>
var n = 0
var m = 0

fun main() {
    val input = br.readLine().split(" ").map{ it.toInt() }
    n = input[0]
    m = input[1]
    maze = Array(n){ Array(m){0} }

    repeat(n){ v ->
        maze[v] = br.readLine().split("").filter { it.isNotEmpty() }.map { it.toInt() }.toTypedArray()
    }

    visited = Array(n){ Array(m){false} }
    visited[0][0] = true
    search(0, 0)
    bw.write("${maze[n-1][m-1]}")

    bw.close()
    br.close()
}

fun search(x : Int, y : Int){
    val queue = LinkedList<Pair<Int, Int>>()
    queue.add(Pair(x, y))

    while (queue.isNotEmpty()){
        val now = queue.poll()
        val nowX = now.first
        val nowY = now.second

        for(i in 0 until 4){
            val nextX = nowX + dx[i]
            val nextY = nowY + dy[i]

            if(nextX < 0 || nextX >= n || nextY < 0 || nextY >= m)
                continue

            if(visited[nextX][nextY] || maze[nextX][nextY] == 0)
                continue

            queue.add(Pair(nextX, nextY))
            maze[nextX][nextY] = maze[nowX][nowY] + 1
            visited[nextX][nextY] = true
        }
    }
}