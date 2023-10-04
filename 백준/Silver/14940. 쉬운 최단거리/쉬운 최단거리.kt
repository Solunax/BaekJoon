import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
lateinit var map : Array<Array<Int>>
lateinit var visit : Array<Array<Boolean>>
lateinit var distance : Array<Array<Int>>
var n = 0
var m = 0
var x = 0
var y = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]
    map = Array(n){ Array(m){0} }
    distance = Array(n){ Array(m){0} }
    visit = Array(n){ Array(m){false} }

    var startCheck = false
    repeat(n){ i ->
        map[i] = br.readLine().split(" ").map { it.toInt() }.toTypedArray()

        if(!startCheck){
            for(j in 0 until m){
                if(map[i][j] == 2){
                    x = i
                    y = j
                    startCheck =  true
                    break
                }
            }
        }
    }

    markingDistance()
    for(i in 0 until n){
        for(j in 0 until m){
            if(!visit[i][j] && map[i][j] == 1)
                bw.write("-1 ")
            else
                bw.write("${distance[i][j]} ")
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}

fun markingDistance(){
    val queue = LinkedList<Pair<Int, Int>>()
    queue.add(Pair(x, y))
    visit[x][y] = true

    while(queue.isNotEmpty()){
        val now = queue.poll()

        repeat(4){
            val nextX = now.first + dx[it]
            val nextY = now.second + dy[it]

            if(nextX in 0 until n && nextY in 0 until m){
                if(!visit[nextX][nextY] && map[nextX][nextY] != 0){
                    queue.add(Pair(nextX, nextY))
                    distance[nextX][nextY] = distance[now.first][now.second] + 1
                    visit[nextX][nextY] = true
                }
            }
        }
    }
}