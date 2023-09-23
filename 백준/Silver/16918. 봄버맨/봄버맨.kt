import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map : Array<Array<String>>
val queue = LinkedList<Pair<Int, Int>>()
val dx = listOf(1, -1, 0, 0)
val dy = listOf(0, 0, 1, -1)
var r = 0
var c = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    r = input[0]
    c = input[1]
    val n = input[2]

    map = Array(r){ Array(c){""} }

    repeat(r){
        map[it] = br.readLine().split("").filter { v -> v.isNotEmpty() }.toTypedArray()
    }

    for(time in 2 .. n){
        if(time % 2 == 1){
            for(i in 0 until r){
                for(j in 0 until c){
                    if(map[i][j] == "O")
                        queue.add(Pair(i, j))
                }
            }

            reFillBomb()
            explode()
        }
    }

    if(n % 2 == 0)
        reFillBomb()

    map.forEach { arr ->
        arr.forEach {
            bw.write(it)
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}

fun reFillBomb(){
    for(i in 0 until r){
        for(j in 0 until c)
            map[i][j] = "O"
    }
}

fun explode(){
    while(queue.isNotEmpty()){
        val now = queue.poll()
        val x = now.first
        val y = now.second
        map[x][y] = "."

        repeat(4){
            val nx = x + dx[it]
            val ny = y + dy[it]

            if(nx in 0 until r && ny in 0 until c){
                if(map[nx][ny] == "O")
                    map[nx][ny] = "."
            }
        }
    }
}