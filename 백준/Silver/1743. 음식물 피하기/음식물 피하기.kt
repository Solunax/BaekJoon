import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map : Array<Array<Int>>
lateinit var visit : Array<Array<Boolean>>
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
var n = 0
var m = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]
    val k = input[2]

    map = Array(n){ Array(m){-1} }
    visit = Array(n){ Array(m){true} }

    repeat(k){
        val (r, c) = br.readLine().split(" ").map { it.toInt() - 1 }
        map[r][c] = 1
        visit[r][c] = false
    }

    val result = ArrayList<Int>()
    for(i in 0 until n){
        for(j in 0 until m){
            if(map[i][j] == 1 && !visit[i][j]){
                visit[i][j] = true
                result.add(getSize(i, j))
            }
        }
    }

    bw.write("${result.sortedDescending()[0]}")

    bw.close()
    br.close()
}

fun getSize(y : Int, x : Int) : Int{
    var size = 1
    val queue = LinkedList<Pair<Int, Int>>()

    queue.add(Pair(y, x))

    while (queue.isNotEmpty()){
        val now = queue.poll()

        repeat(4){
            val nextX = now.second + dx[it]
            val nextY = now.first + dy[it]

            if(nextY in 0 until n && nextX in 0 until m){
                if(!visit[nextY][nextX]){
                    size++
                    map[nextY][nextX] = size
                    visit[nextY][nextX] = true
                    queue.add(Pair(nextY, nextX))
                }

            }
        }
    }

    return size
}