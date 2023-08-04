import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (c, r) = br.readLine().split(" ").map { it.toInt() }
    val n = br.readLine().toInt()
    val map = Array(r){ Array(c){0} }

    if(n > c * r)
        bw.write("0")
    else if(n == 1)
        bw.write("1 1")
    else{
        val dx = listOf(-1, 0, 1, 0)
        val dy = listOf(0, 1, 0, -1)
        var dir = 0
        var x = r - 1
        var y = 0
        var count = 1
        map[x][y] = count

        while (true){
            val nextX = x + dx[dir]
            val nextY = y + dy[dir]

            if(nextX in 0 until r && nextY in 0 until c){
                if(map[nextX][nextY] == 0){
                    map[nextX][nextY] = ++count
                    x = nextX
                    y = nextY
                }else
                    dir = (dir + 1) % 4
            }else
                dir = (dir + 1) % 4

            if (count == n){
                bw.write("${y + 1} ${r - x}")
                break
            }
        }
    }

    bw.close()
    br.close()
}