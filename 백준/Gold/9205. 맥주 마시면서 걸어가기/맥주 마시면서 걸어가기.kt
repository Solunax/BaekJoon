import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var start : Array<Int>
lateinit var store : Array<Array<Int>>
lateinit var end : Array<Int>
var n = 0
fun main() {
    repeat(br.readLine().toInt()) {
        n = br.readLine().toInt()
        start = br.readLine().split(" ").map { it.toInt() }.toTypedArray()
        store = Array(n){ Array(2){0} }

        repeat(n) {
            store[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
        }

        end = br.readLine().split(" ").map { it.toInt() }.toTypedArray()
        if (searchRoute()) {
            bw.write("happy\n")
        } else {
            bw.write("sad\n")
        }
    }

    bw.close()
    br.close()
}

fun searchRoute() : Boolean {
    val queue = LinkedList<Pair<Int, Int>>()
    val visit = Array(n){false}
    queue.add(Pair(start[0], start[1]))

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        if (abs(end[0] - now.first) + abs(end[1] - now.second) <= 1000) {
            return true
        }

        repeat(n) { i ->
            if(!visit[i]) {
                val nx = store[i][0]
                val ny = store[i][1]

                if(abs(now.first - nx) + abs(now.second - ny) <= 1000) {
                    visit[i] = true
                    queue.add(Pair(nx, ny))
                }
            }
        }
    }

    return false
}