import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val dx = listOf(0, 1, 0, -1)
val dy = listOf(1, 0, -1, 0)

fun main() {
    val (m, n) = br.readLine().split(" ").map { it.toInt() }
    val visit = Array(m){ Array(n){false} }

    var turn = 0
    var count = 1
    var nowX = 0
    var nowY = 0
    var nextX : Int
    var nextY: Int
    var dir = 0

    visit[nowX][nowY] = true

    while (true){
        if(count == m * n)
            break

        nextX = nowX + dx[dir]
        nextY = nowY + dy[dir]

        if(nextX in 0 until m && nextY in 0 until n && !visit[nextX][nextY]){
            visit[nextX][nextY] = true
            count++
            nowX = nextX
            nowY = nextY
        }else{
            dir++
            turn++
        }

        if(dir >= 4)
            dir = 0
    }

    bw.write("$turn")

    bw.close()
    br.close()
}