import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var box : Array<Array<Array<Int>>>
lateinit var queue: LinkedList<Triple<Int, Int, Int>>
val dx = listOf(1, -1, 0, 0, 0, 0)
val dy = listOf(0, 0, 1, -1, 0, 0)
val dh = listOf(0, 0, 0, 0, 1, -1)
var m = 0
var n = 0
var h = 0

fun main() {
    val input = br.readLine().split(" ").map{ it.toInt() }
    m = input[0]
    n = input[1]
    h = input[2]

    box = Array(h){ Array(n){ Array(m){0} } }
    queue = LinkedList()

    for(i in 0 until h){
        for(j in 0 until n){
            box[i][j] = br.readLine().split(" ").map { it.toInt() }.toTypedArray()

            for(k in 0 until m){
                if(box[i][j][k] == 1)
                    queue.add(Triple(i, j, k))
            }
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

        for(i in 0 until 6){
            val nh = now.first + dh[i]
            val nx = now.second + dx[i]
            val ny = now.third + dy[i]

            if(nx in 0 until n && ny in 0 until m && nh in 0 until h){
                if(box[nh][nx][ny] == 0){
                    queue.add(Triple(nh, nx, ny))

                    box[nh][nx][ny] = box[now.first][now.second][now.third] + 1
                }
            }
        }
    }

    for(i in 0 until h){
        for(j in 0 until n){
            for(k in 0 until m){
                if(box[i][j][k] == 0)
                    return -1

                result = max(result, box[i][j][k])
            }
        }
    }

    return if(result == 1)
         0
    else
        result - 1
}