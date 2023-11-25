import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val dx = listOf(-2, -1, 1, 2, -2, -1, 1, 2)
val dy = listOf(-1, -2, -2, -1, 1, 2, 2, 1)
var l = 0
var locX = 0
var locY = 0
lateinit var visit : Array<Array<Boolean>>

fun main() {
    repeat(br.readLine().toInt()) {
        l = br.readLine().toInt()
        val start = br.readLine().split(" ").map { it.toInt() }
        val destination = br.readLine().split(" ").map { it.toInt() }
        locX = destination[0]
        locY = destination[1]
        visit = Array(l){ Array(l){ false } }

        bw.write("${searchRoute(start[0], start[1])}\n")
    }

    bw.close()
    br.close()
}

fun searchRoute (x : Int, y : Int) : Int {
    val queue = LinkedList<Node>()
    queue.add(Node(x, y, 0))
    visit[x][y] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        if (now.x == locX && now.y == locY) {
            return now.move
        }

        for (i in 0 until 8) {
            val nx = now.x + dx[i]
            val ny = now.y + dy[i]

            if (nx in 0 until l && ny in 0 until l) {
                if (!visit[nx][ny]) {
                    queue.add(Node(nx, ny, now.move + 1))
                    visit[nx][ny] = true
                }
            }
        }
    }

    return 0
}

data class Node(val x : Int, val y : Int, val move : Int)