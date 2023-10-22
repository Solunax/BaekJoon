import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
lateinit var map : Array<Array<Int>>
lateinit var visit : Array<Array<Boolean>>
var x = 0
var y = 0
var cheese = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    y = input[0]
    x = input[1]
    map = Array(y) { Array(x) { 0 } }

    repeat(y) {
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()

        map[it].forEach { v ->
            if(v == 1)
                cheese++
        }
    }

    var last = 0
    var time = 0
    while (cheese != 0) {
        last = cheese
        time++
        visit = Array(y){ Array(x){ false } }
        melt()
    }

    bw.write("$time\n$last")

    bw.close()
    br.close()
}

fun melt(){
    val queue = LinkedList<Pair<Int, Int>>()
    queue.add(Pair(0, 0))
    visit[0][0] = true

    while (queue.isNotEmpty()){
        val now = queue.poll()

        repeat(4){
            val nx = now.first + dx[it]
            val ny = now.second + dy[it]

            if(nx in 0 until x && ny in 0 until y
                && !visit[ny][nx]){
                visit[ny][nx] = true
                if(map[ny][nx] == 0){
                    queue.add(Pair(nx, ny))
                } else {
                    cheese--
                    map[ny][nx] = 0
                }
            }
        }
    }
}