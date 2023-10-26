import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
lateinit var map : Array<Array<Int>>
lateinit var meltMap : Array<Array<Int>>
lateinit var visit : Array<Array<Boolean>>
var n = 0
var m = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]

    map = Array(n){ Array(m){0} }

    repeat(n){
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
    }

    var year = 0
    while (true) {
        visit = Array(n){ Array(m){false} }

        var chunk = 0
        for(y in 0 until n){
            for(x in 0 until m){
                if(map[y][x] != 0 && !visit[y][x]){
                    chunkCheck(y, x)
                    chunk++
                }
            }
        }

        if(chunk == 0){
            bw.write("0")
            break
        } else if(chunk >= 2){
            bw.write("$year")
            break
        }

        meltMap = Array(n){ Array(m){0} }
        melt()

        year++
    }

    bw.close()
    br.close()
}

fun melt(){
    for(y in 0 until n){
        for(x in 0 until m){
            if(map[y][x] != 0){
                var count = 0

                repeat(4){
                    val nx = x + dx[it]
                    val ny = y + dy[it]

                    if(nx in 0 until m && ny in 0 until n){
                        if(map[ny][nx] == 0)
                            count++
                    }
                }

                meltMap[y][x] = if(map[y][x] - count >= 0){
                    map[y][x] - count
                } else {
                    0
                }
            }
        }
    }

    map = meltMap
}

fun chunkCheck(y : Int, x : Int){
    val queue = LinkedList<Pair<Int, Int>>()
    queue.add(Pair(x, y))
    visit[y][x] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        repeat(4){
            val nx = now.first + dx[it]
            val ny = now.second + dy[it]

            if(nx in 0 until m && ny in 0 until n){
                if(map[ny][nx] != 0 && !visit[ny][nx]){
                    queue.add(Pair(nx, ny))
                    visit[ny][nx] = true
                }
            }
        }
    }
}