import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map : Array<Array<Int>>
val spin = HashMap<Int, String>()
val dx = listOf(0, 1, 0, -1)
val dy = listOf(1, 0, -1, 0)
var n = 0

fun main() {
    n = br.readLine().toInt()
    map = Array(n){ Array(n){0} }

    repeat(br.readLine().toInt()){
        val (r, c) = br.readLine().split(" ").map{ it.toInt() - 1}

        map[r][c] = 1
    }

    repeat(br.readLine().toInt()){
        val (t, l) = br.readLine().split(" ")

        spin[t.toInt()] = l
    }
    
    getResult()

    bw.close()
    br.close()
}

fun getResult(){
    var nowX = 0
    var nowY = 0
    var time = 0
    var dir = 0
    val snake = ArrayList<Pair<Int, Int>>()

    snake.add(Pair(0, 0))

    while (true){
        time++

        val nx = nowX + dx[dir]
        val ny = nowY + dy[dir]

        if(nx !in 0 until n || ny !in 0 until n)
            break

        var check = true
        for(location in snake){
            if(location.first == nx && location.second == ny){
                check = false
                break
            }
        }

        if(!check)
            break

        if(map[nx][ny] == 1){
            map[nx][ny] = 0
            snake.add(Pair(nx, ny))
        }else{
            snake.add(Pair(nx, ny))
            snake.removeFirst()
        }

        if(spin.containsKey(time)){
            if(spin[time] == "L"){
                dir -= 1

                if(dir == -1)
                    dir = 3
            }else{
                dir += 1

                if(dir == 4)
                    dir = 0
            }
        }

        nowX = nx
        nowY = ny
    }

    bw.write("$time")
}