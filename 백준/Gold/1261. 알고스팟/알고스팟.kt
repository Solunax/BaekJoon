import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
var locY = 0
var locX = 0
lateinit var map : Array<Array<Int>>
lateinit var visit : Array<Array<Boolean>>

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    locX = input[0]
    locY = input[1]
    map = Array(locY){ Array(locX){0} }
    visit = Array(locY){ Array(locX){false} }

    repeat(locY) {
        map[it] = br.readLine().split("").filter { v -> v.isNotEmpty() }.map { v -> v.toInt() }.toTypedArray()
    }
    bw.write("${searchRoute(0, 0)}")

    bw.close()
    br.close()
}

fun searchRoute (x : Int, y : Int) : Int {
    val queue = PriorityQueue<Node>()
    queue.add(Node(x, y, 0))
    visit[y][x] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        if (now.x == locX - 1 && now.y == locY - 1) {
            return now.count
        }

        for (i in 0 until 4) {
            val nx = now.x+ dx[i]
            val ny = now.y + dy[i]

            if (nx in 0 until locX && ny in 0 until locY) {
                if (visit[ny][nx]) {
                    continue
                }

                if (map[ny][nx] == 1) {
                    queue.add(Node(nx, ny, now.count + 1))
                } else {
                    queue.add(Node(nx, ny, now.count))
                }

                visit[ny][nx] = true
            }
        }
    }

    return 0
}

class Node(val x : Int, val y : Int, val count : Int) : Comparable<Node> {
    override fun compareTo(other: Node): Int {
        return this.count - other.count
    }
}