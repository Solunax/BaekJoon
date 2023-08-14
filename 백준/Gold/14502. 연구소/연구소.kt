import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map : Array<Array<Int>>
var n = 0
var m = 0
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
var safe = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]

    map = Array(n){ Array(m){0} }
    repeat(n){
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
    }

    buildWall(0)
    bw.write("$safe")

    bw.close()
    br.close()
}

fun buildWall(count : Int){
    if(count == 3){
        infect()
        return
    }

    for(i in 0 until n){
        for(j in 0 until m){
            if(map[i][j] == 0){
                map[i][j] = 1
                buildWall(count + 1)
                map[i][j] = 0
            }
        }
    }
}

fun infect(){
    val queue = LinkedList<Pair<Int, Int>>()

    for(i in 0 until n){
        for(j in 0 until m){
            if(map[i][j] == 2)
                queue.add(Pair(i, j))
        }
    }

    val copy = Array(n){ Array(m){0} }
    repeat(n){
        copy[it] = map[it].clone()
    }

    while (queue.isNotEmpty()){
        val now = queue.poll()

        repeat(4){
            val nx = now.first + dx[it]
            val ny = now.second + dy[it]

            if(nx in 0 until n && ny in 0 until m){
                if(copy[nx][ny] == 0){
                    queue.add(Pair(nx, ny))
                    copy[nx][ny] = 2
                }
            }
        }
    }

    calculateSafe(copy)
}

fun calculateSafe(copy : Array<Array<Int>>){
    var count = 0

    for(i in 0 until n){
        for(j in 0 until m){
            if(copy[i][j] == 0)
                count++
        }
    }

    safe = max(safe, count)
}