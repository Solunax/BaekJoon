import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
var locY = 0
var locX = 0
lateinit var map : Array<Array<Int>>
lateinit var visit : Array<Array<Array<Boolean>>>

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    locX = input[1]
    locY = input[0]
    map = Array(locY){ Array(locX){0} }
    visit = Array(locY){ Array(locX){ Array(2){false} } }

    repeat(locY) {
        map[it] = br.readLine().split("").filter { v -> v.isNotEmpty() }.map { v -> v.toInt() }.toTypedArray()
    }
    bw.write("${searchRoute(0, 0)}")

    bw.close()
    br.close()
}

fun searchRoute (x : Int, y : Int) : Int {
    val queue = LinkedList<Node>()
    queue.add(Node(x, y, 0, false))
    visit[y][x][0] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        if (now.x == locX - 1 && now.y == locY - 1) {
            return now.moveCount + 1
        }

        for (i in 0 until 4) {
            val nx = now.x + dx[i]
            val ny = now.y + dy[i]

            if (nx in 0 until locX && ny in 0 until locY) {
                if (map[ny][nx] == 0) {
                    if (!now.breakCheck && !visit[ny][nx][0]) {
                        queue.add(Node(nx, ny, now.moveCount + 1, false))
                        visit[ny][nx][0] = true
                    } else if (now.breakCheck && !visit[ny][nx][1]) {
                        queue.add(Node(nx, ny, now.moveCount + 1, true))
                        visit[ny][nx][1] = true
                    }
                } else {
                    if (!now.breakCheck) {
                        queue.add(Node(nx, ny, now.moveCount + 1, true))
                        visit[ny][nx][1] = true
                    }
                }
            }
        }
    }

    return -1
}

data class Node(val x : Int, val y : Int, val moveCount : Int, val breakCheck : Boolean)