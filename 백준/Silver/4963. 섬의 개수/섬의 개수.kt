import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map : Array<Array<Int>>
lateinit var visited : Array<Array<Boolean>>

val dx = listOf(-1 , 0, 1, -1, 1, -1, 0, 1)
val dy = listOf(-1, -1, -1, 0, 0, 1, 1, 1)
var maxW = 0
var maxH = 0

fun main() {
    while(true){
        val (w, h) = br.readLine().split(" ").map{ it.toInt() }

        if(w == 0 && h == 0)
            break

        maxW = w
        maxH = h

        map = Array(h){ Array(w){0} }
        visited = Array(h){ Array(w){false} }

        repeat(h){
            map[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
        }

        var result = 0
        for(i in 0 until h){
            for(j in 0 until w){
                if(map[i][j] == 1 && !visited[i][j]){
                    search(i, j)
                    result++
                }
            }
        }

        bw.write("$result\n")
    }

    bw.close()
    br.close()
}

fun search(h : Int, w : Int){
    val queue = LinkedList<Pair<Int, Int>>()
    visited[h][w] = true
    queue.add(Pair(h, w))

    while (queue.isNotEmpty()){
        val now = queue.poll()

        for(i in 0 until 8){
            val nextX = now.second + dx[i]
            val nextY = now.first + dy[i]

            if(nextX in 0 until maxW && nextY in 0 until  maxH){
                if (visited[nextY][nextX])
                    continue

                if(map[nextY][nextX] == 1){
                    visited[nextY][nextX] = true
                    queue.add(Pair(nextY, nextX))
                }
            }
        }
    }
}