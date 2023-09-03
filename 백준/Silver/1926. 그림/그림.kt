import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var paper : Array<Array<Int>>
lateinit var visit : Array<Array<Boolean>>
lateinit var queue : LinkedList<Pair<Int, Int>>
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
var n = 0
var m = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]

    paper = Array(n){ Array(m){0} }
    visit = Array(n){ Array(m){false} }
    queue = LinkedList()

    repeat(n){
        paper[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
    }

    var count = 0
    var maxSize = 0
    for(i in 0 until n){
        for(j in 0 until m){
            if(paper[i][j] == 1 && !visit[i][j]){
                count++
                queue.add(Pair(i, j))
                visit[i][j] = true
                maxSize = max(getSize(), maxSize)
            }
        }
    }

    bw.write("$count\n")
    bw.write("$maxSize")

    bw.close()
    br.close()
}

fun getSize() : Int{
    var size = 0

    while (queue.isNotEmpty()){
        val now = queue.poll()
        size++

        for(i in 0 until 4){
            val nx = now.first + dx[i]
            val ny = now.second + dy[i]

            if(nx in 0 until n && ny in 0 until m){
                if(paper[nx][ny] == 1 && !visit[nx][ny]){
                    visit[nx][ny] = true
                    queue.add(Pair(nx, ny))
                }
            }
        }
    }

    return size
}