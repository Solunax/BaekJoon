import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

val dx = listOf(-1, 0, 1, 0)
val dy = listOf(0, 1, 0, -1)

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val map = Array(n){Array(m){0}}
    var (x, y, d) = br.readLine().split(" ").map { it.toInt() }

    repeat(n){
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
    }

    map[x][y] = 2
    var nx : Int
    var ny : Int

    while(true){
        var isClean = false
        var isPossible = true

        for(i in 0 until 4){
            nx = x + dx[(d+3-i) % 4]
            ny = y + dy[(d+3-i) % 4]

            if(map[nx][ny] == 0){
                x = nx
                y = ny
                d = (d+3-i) % 4
                map[x][y] = 2
                isClean = true
                break
            }
        }

        if(isClean)
            continue

        nx = x + dx[(d+2)%4]
        ny = y + dy[(d+2)%4]

        if(map[nx][ny] == 1)
            isPossible = false
        else{
            x = nx
            y = ny
        }

        if(!isPossible)
            break
    }

    var result = 0
    map.forEach {
        it.forEach { v ->
            if(v == 2)
                result++
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}