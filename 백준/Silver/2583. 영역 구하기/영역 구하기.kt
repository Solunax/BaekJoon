import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
lateinit var map : Array<Array<Int>>
lateinit var visited : Array<Array<Boolean>>
var m = 0
var n = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }

    m = input[0]
    n = input[1]
    val k = input[2]

    map = Array(m){ Array(n){0} }
    visited = Array(m){ Array(n){false} }

    repeat(k){
        val (x1, y1, x2, y2) = br.readLine().split(" ").map { it.toInt() }

        for(i in x1 until x2){
            for(j in y1 until y2){
                map[j][i] = 1
                visited[j][i] = true
            }
        }
    }

    val zoneSize = ArrayList<Int>()
    for(i in 0 until m){
        for(j in 0 until n){
            if(map[i][j] == 0 && !visited[i][j]){
                map[i][j] = 1
                visited[i][j] = true
                zoneSize.add(getSize(i, j))
            }
        }
    }

    bw.write("${zoneSize.size}\n")
    zoneSize.sorted().forEach {
        bw.write("$it ")
    }

    bw.close()
    br.close()
}

fun getSize(y : Int, x : Int) : Int{
    var size = 1
    val queue = LinkedList<Pair<Int, Int>>()
    queue.add(Pair(x, y))

    while(queue.isNotEmpty()){
        val now = queue.poll()

        for(i in 0 until 4){
            val nextX = now.first + dx[i]
            val nextY = now.second + dy[i]

            if(nextX in 0 until n && nextY in 0 until m){
                if(visited[nextY][nextX])
                    continue

                size++
                map[nextY][nextX] = 1
                visited[nextY][nextX] = true
                queue.add(Pair(nextX, nextY))
            }
        }
    }

    return size
}