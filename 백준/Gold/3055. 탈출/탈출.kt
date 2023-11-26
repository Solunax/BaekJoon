import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
var mapX = 0
var mapY = 0
var startX = 0
var startY = 0
var destinationX = 0
var destinationY = 0

lateinit var map : Array<Array<String>>
lateinit var visit : Array<Array<Boolean>>
lateinit var water : LinkedList<Pair<Int, Int>>

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    mapX = input[1]
    mapY = input[0]
    map = Array(mapY){ Array(mapX){""} }
    visit = Array(mapY){ Array(mapX){false} }
    water = LinkedList<Pair<Int, Int>>()

    for (i in 0 until mapY) {
        val line = br.readLine().split("").filter { it.isNotEmpty() }
        map[i] = line.toTypedArray()

        for (j in 0 until mapX) {
            when (line[j]) {
                "S" -> {
                    startX = j
                    startY = i
                }
                "D" -> {
                    destinationX = j
                    destinationY = i
                }
                "*" -> {
                    water.add(Pair(j, i))
                }
            }
        }
    }

    val result = searchRoute(startX, startY)

    if (result == -1) {
        bw.write("KAKTUS")
    } else {
        bw.write("$result")
    }

    bw.close()
    br.close()
}

fun searchRoute (x : Int, y : Int) : Int {
    val queue = LinkedList<Node>()
    queue.add(Node(x, y, 0))
    visit[y][x] = true
    var len: Int

    while (queue.isNotEmpty()) {
        len = water.size
        for (i in 0 until len) {
            val now = water.poll()

            for (j in 0 until 4) {
                val nx = now.first + dx[j]
                val ny = now.second + dy[j]

                if (nx in 0 until mapX && ny in 0 until mapY) {
                    if (map[ny][nx] == ".") {
                        map[ny][nx] = "*"
                        water.add(Pair(nx, ny))
                    }
                }
            }
        }

        len = queue.size
        for (i in 0 until len) {
            val now = queue.pop()

            for (j in 0 until 4) {
                val nx = now.x + dx[j]
                val ny = now.y + dy[j]

                if (nx in 0 until mapX && ny in 0 until mapY) {
                    if (map[ny][nx] == "D") {
                        return now.time + 1
                    }

                    if (map[ny][nx] == "." && !visit[ny][nx]) {
                        visit[ny][nx] = true
                        queue.add(Node(nx, ny, now.time + 1))
                    }
                }
            }
        }
    }

    return -1
}

data class Node (val x : Int, val y : Int, val time : Int)
