import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val dx = listOf(1, -1, 0, 0)
val dy = listOf(0, 0, -1, 1)
val dice = Array(7) { 0 }
lateinit var map: Array<Array<Int>>
var n = 0
var m = 0
var x = 0
var y = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]
    x = input[3]
    y = input[2]
    map = Array(n) { Array(m) { 0 } }

    repeat(n) {
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
    }

    br.readLine().split(" ").map { it.toInt() }.forEach { d ->
        moveDice(d)
    }

    bw.close()
    br.close()
}

fun moveDice(direction: Int) {
    val nx = x + dx[direction - 1]
    val ny = y + dy[direction - 1]

    if (nx in 0 until m && ny in 0 until n) {
        rollingDice(direction, nx, ny)
        x = nx
        y = ny
    }
}

fun rollingDice(d: Int, nx: Int, ny: Int) {
    val temp = dice[3]
    when (d) {
        1 -> {
            dice[3] = dice[4]
            dice[4] = dice[6]
            dice[6] = dice[2]
            dice[2] = temp
        }
        2 -> {
            dice[3] = dice[2]
            dice[2] = dice[6]
            dice[6] = dice[4]
            dice[4] = temp
        }
        3 -> {
            dice[3] = dice[5]
            dice[5] = dice[6]
            dice[6] = dice[1]
            dice[1] = temp
        }
        4 -> {
            dice[3] = dice[1]
            dice[1] = dice[6]
            dice[6] = dice[5]
            dice[5] = temp
        }
    }

    if (map[ny][nx] == 0) {
        map[ny][nx] = dice[6]
    } else {
        dice[6] = map[ny][nx]
        map[ny][nx] = 0
    }

    bw.write("${dice[3]}\n")
}