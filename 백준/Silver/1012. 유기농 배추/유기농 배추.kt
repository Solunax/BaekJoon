import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val dx = listOf(0, 1, 0, -1)
val dy = listOf(-1, 0, 1, 0)
lateinit var farm : Array<Array<Int>>
lateinit var visited : Array<Array<Boolean>>
var maxX = 0
var maxY = 0
var count = 0

fun main() {
    repeat(br.readLine().toInt()){
        count = 0
        val (m, n, k) = br.readLine().split(" ").map { it.toInt() }
        maxX = m
        maxY = n
        farm = Array(m){ Array(n){0} }
        visited = Array(m){ Array(n){false} }

        repeat(k){
            val (bx, by) = br.readLine().split(" ").map { it.toInt() }
            farm[bx][by] = 1
        }

        for(i in 0 until maxX){
            for(j in 0 until maxY){
                if(farm[i][j] == 1 && !visited[i][j]){
                    getResult(i, j)
                    count++
                }
            }
        }

        bw.write("$count\n")
    }

    bw.close()
    br.close()
}

fun getResult(x : Int, y : Int){
    val queue = LinkedList<Pair<Int, Int>>()
    queue.add(Pair(x, y))

    while (queue.isNotEmpty()){
        val now = queue.poll()

        for(i in 0 until 4){
            val nextX = now.first + dx[i]
            val nextY = now.second + dy[i]

            if(nextX >= 0 && nextX < maxX && nextY >= 0 && nextY < maxY){
                if(visited[nextX][nextY])
                    continue

                if(farm[nextX][nextY] == 1){
                    visited[nextX][nextY] = true
                    queue.add(Pair(nextX, nextY))
                }
            }
        }
    }
}
