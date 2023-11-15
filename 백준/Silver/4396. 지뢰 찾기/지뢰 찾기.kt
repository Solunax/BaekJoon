import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val n = br.readLine().toInt()
val dx = listOf(-1, 0, 1, -1, 0, 1, -1, 0, 1)
val dy = listOf(1, 1, 1, 0, 0, 0, -1, -1, -1)
lateinit var mine : Array<Array<String>>

fun main() {
    mine = Array(n){ Array(n){""} }
    val check = Array(n){ Array(n){""} }
    val result = Array(n){ Array(n){0} }

    repeat(n) {
        mine[it] = br.readLine().split("").filter { v -> v.isNotEmpty() }.toTypedArray()
    }

    repeat(n) {
        check[it] = br.readLine().split("").filter { v -> v.isNotEmpty() }.toTypedArray()
    }

    var mineCheck = false
    for (y in 0 until n) {
        for (x in 0 until n) {
            if(check[y][x] == "x" && mine[y][x] == "*" &&
                    !mineCheck){
                mineCheck = true
            }

            if (check[y][x] == ".") {
                result[y][x] = -1
            } else {
                result[y][x] = getMineCount(x, y)
            }
        }
    }

    for (y in 0 until n) {
        val sb = StringBuilder()

        for (x in 0 until n) {
            if(mine[y][x] == "*" && mineCheck){
                sb.append('*')
            } else {
                when (result[y][x]) {
                    -1 -> sb.append('.')
                    else -> sb.append(result[y][x])
                }
            }
        }

        bw.write("$sb\n")
    }

    bw.close()
    br.close()
}

fun getMineCount(x : Int, y : Int) : Int {
    var count = 0

    for (i in 0 until 9) {
        val nx = x + dx[i]
        val ny = y + dy[i]

        if(nx in 0 until n && ny in 0 until n){
            if(mine[ny][nx] == "*"){
                count++
            }
        }
    }

    return count
}