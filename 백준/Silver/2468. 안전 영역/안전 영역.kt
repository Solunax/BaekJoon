import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map : Array<Array<Int>>
lateinit var visited : Array<Array<Boolean>>

val dx = listOf(0, 1, 0, -1)
val dy = listOf(1, 0, -1, 0)
var maxH = 0
var n = 0

fun main() {
    n = br.readLine().toInt()
    map = Array(n){ Array(n){0} }

    repeat(n){
        val input = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()

        input.forEach { v ->
            if(v > maxH)
                maxH = v
        }

        map[it] = input
    }

    var result = 0
    for(height in 0 .. maxH){
        visited = Array(n){ Array(n){false} }

        var count = 0
        for(i in 0 until n){
            for(j in 0 until n){
                if(map[i][j] > height && !visited[i][j]){
                    search(i, j, height)
                    count++
                }
            }
        }

        result = max(result, count)
    }

    bw.write("$result\n")

    bw.close()
    br.close()
}

fun search(x : Int, y : Int, h : Int){
    val queue = LinkedList<Pair<Int, Int>>()
    visited[x][y] = true
    queue.add(Pair(x, y))

    while (queue.isNotEmpty()){
        val now = queue.poll()

        for(i in 0 until 4){
            val nextX = now.first + dx[i]
            val nextY = now.second + dy[i]

            if(nextX in 0 until n && nextY in 0 until  n){
                if (visited[nextX][nextY])
                    continue

                if(map[nextX][nextY] > h){
                    visited[nextX][nextY] = true
                    queue.add(Pair(nextX, nextY))
                }
            }
        }
    }
}