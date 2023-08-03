import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var box : Array<Array<Int>>
lateinit var queue: LinkedList<Pair<Int, Int>>
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
var m = 0
var n = 0

fun main() {
    val input = br.readLine().split(" ").map{ it.toInt() }
    m = input[0]
    n = input[1]

    box = Array(n){ Array(m){0} }
    queue = LinkedList()

    for(i in 0 until n){
        box[i] = br.readLine().split(" ").map { it.toInt() }.toTypedArray()

        for(j in 0 until m){
            if(box[i][j] == 1)
                queue.add(Pair(i, j))
        }
    }

    bw.write("${search()}")

    bw.close()
    br.close()
}

fun search() : Int{
    var result = 0

    while(queue.isNotEmpty()){
        val now = queue.poll()

        for(i in 0 until 4){
            val nx = now.first + dx[i]
            val ny = now.second + dy[i]

            if(nx in 0 until n && ny in 0 until m){
                if(box[nx][ny] == 0){
                    queue.add(Pair(nx, ny))

                    box[nx][ny] = box[now.first][now.second] + 1
                }
            }
        }
    }

    for(i in 0 until n){
        for(j in 0 until m){
            if(box[i][j] == 0)
                return -1

            result = max(result, box[i][j])
        }
    }
    return if(result == 1)
        0
    else
        result - 1
}