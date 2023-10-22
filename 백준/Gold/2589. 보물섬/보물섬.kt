import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
lateinit var map : Array<Array<String>>
lateinit var visit : Array<Array<Boolean>>
var x = 0
var y = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    y = input[0]
    x = input[1]
    map = Array(y){ Array(x) { "" } }

    repeat(y) {
        map[it] = br.readLine().split("").filter { v -> v.isNotEmpty() }.toTypedArray()
    }

    var result = 0
    for(i in 0 until y){
        for(j in 0 until x){
            if(map[i][j] == "L"){
                visit = Array(y){ Array(x){ false } }
                result = max(result, search(i, j))
            }
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}

fun search(i : Int, j : Int) : Int{
    val queue = LinkedList<Triple<Int, Int, Int>>()
    queue.add(Triple(i, j, 0))
    visit[i][j] = true
    var distance = 0

    while (queue.isNotEmpty()){
        val now = queue.poll()

        repeat(4){
            val ny = now.first + dy[it]
            val nx = now.second + dx[it]

            if(nx in 0 until x && ny in 0 until y
                && !visit[ny][nx] && map[ny][nx] == "L"){
                visit[ny][nx] = true
                queue.add(Triple(ny, nx, now.third + 1))
                distance = max(distance, now.third + 1)
            }
        }
    }

    return distance
}