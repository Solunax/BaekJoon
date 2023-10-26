import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
lateinit var map : Array<Array<Int>>
lateinit var visit : Array<Array<Boolean>>
lateinit var city : ArrayList<Pair<Int, Int>>
var n = 0
var l = 0
var r = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    l = input[1]
    r = input[2]

    map = Array(n){ Array(n){0} }

    repeat(n){
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
    }

    var result = 0
    while (true) {
        var check = false
        visit = Array(n){ Array(n){false} }

        for(i in 0 until n){
            for(j in 0 until n){
                if(!visit[i][j]){
                    val population = search(i, j)

                    if(city.size > 1){
                        moveCitizen(population)
                        check = true
                    }
                }
            }
        }

        if(!check)
            break

        result++
    }
    bw.write("$result")

    bw.close()
    br.close()
}

fun search(y : Int, x : Int) : Int {
    val queue = LinkedList<Pair<Int, Int>>()
    city = ArrayList()

    queue.add(Pair(x, y))
    city.add(Pair(x, y))
    visit[y][x] = true

    var sum = map[y][x]
    while (queue.isNotEmpty()) {
        val now = queue.poll()

        repeat(4){
            val nx = now.first + dx[it]
            val ny = now.second + dy[it]

            if(nx in 0 until n && ny in 0 until n && !visit[ny][nx]){
                val diff = abs(map[now.second][now.first] - map[ny][nx])

                if(diff in l .. r){
                    queue.add(Pair(nx, ny))
                    city.add(Pair(nx, ny))
                    sum += map[ny][nx]
                    visit[ny][nx] = true
                }
            }
        }
    }

    return sum
}

fun moveCitizen(num : Int){
    val average = num / city.size

    for(location in city)
        map[location.second][location.first] = average
}