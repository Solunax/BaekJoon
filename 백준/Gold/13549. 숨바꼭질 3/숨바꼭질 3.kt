import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
var k = 0
lateinit var map : Array<Boolean>

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    k = input[1]
    map = Array(100001){false}

    if (k <= n) {
        bw.write("${n - k}")
    } else {
        bw.write("${search()}")
    }

    bw.close()
    br.close()
}

fun search() : Int {
    val queue = LinkedList<SooBin>()
    queue.add(SooBin(n, 0))

    while (queue.isNotEmpty()) {
        val now = queue.poll()
        map[now.location] = true

        if (now.location == k) {
            return now.time
        }

        if (now.location * 2 in 0 until 100001) {
            if (!map[now.location * 2]){
                map[now.location * 2] = true
                queue.add(SooBin(now.location * 2, now.time))
            }
        }

        if (now.location - 1 in 0 until 100001) {
            if (!map[now.location - 1]) {
                map[now.location - 1] = true
                queue.add(SooBin(now.location - 1, now.time + 1))
            }
        }

        if (now.location + 1 in 0 until 100001) {
            if (!map[now.location + 1]) {
                map[now.location + 1] = true
                queue.add(SooBin(now.location + 1, now.time + 1))
            }
        }
    }

    return 0
}

data class SooBin (val location : Int, val time : Int) : Comparable<SooBin> {
    override fun compareTo(other: SooBin): Int {
        return this.time - other.time
    }
}