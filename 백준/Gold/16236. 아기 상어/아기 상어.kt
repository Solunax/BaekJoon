import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map : Array<Array<Int>>
val dx = listOf(0, -1, 1, 0)
val dy = listOf(-1, 0, 0, 1)
var n = 0
var sharkX = 0
var sharkY = 0
var result = 0

fun main() {
    n = br.readLine().toInt()
    map = Array(n){ Array(n){0} }

    for(i in 0 until n){
        val input = br.readLine().split(" ").map{ it.toInt() }
        map[i]= input.toTypedArray()

        for(j in 0 until n){
            if(input[j] == 9) {
                sharkX = j
                sharkY = i
                map[i][j] = 0
            }
        }
    }

    search()
    bw.write("$result")

    bw.close()
    br.close()
}

fun search(){
    var eatCount = 0
    var sharkSize = 2

    while (true){
        val queue = LinkedList<Pair<Int, Int>>()
        val distance = Array(n){ Array(n){0} }

        var x = Int.MAX_VALUE
        var y = Int.MAX_VALUE
        var d = Int.MAX_VALUE

        queue.add(Pair(sharkX, sharkY))

        while (queue.isNotEmpty()){
            val now = queue.poll()

            for(i in 0 until 4){
                val nx = now.first + dx[i]
                val ny = now.second + dy[i]

                if(nx in 0 until n && ny in 0 until n){
                    if(map[ny][nx] > sharkSize)
                        continue

                    if(distance[ny][nx] != 0)
                        continue

                    distance[ny][nx] = distance[now.second][now.first] + 1

                    if(map[ny][nx] < sharkSize && map[ny][nx] != 0){
                        if(distance[ny][nx] < d){
                            d = distance[ny][nx]
                            x = nx
                            y = ny
                        }else if(d == distance[ny][nx]){
                            if(ny == y){
                                if(nx < x){
                                    x = nx
                                    y = ny
                                }
                            }else if(ny < y){
                                x = nx
                                y = ny
                            }
                        }
                    }

                    queue.add(Pair(nx, ny))
                }
            }
        }

        if(x == Int.MAX_VALUE && y == Int.MAX_VALUE)
            break

        result += distance[y][x]
        map[y][x] = 0

        sharkX = x
        sharkY = y
        eatCount++

        if(eatCount == sharkSize){
            sharkSize++
            eatCount = 0
        }
    }
}