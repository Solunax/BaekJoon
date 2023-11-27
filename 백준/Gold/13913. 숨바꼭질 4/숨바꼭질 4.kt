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
        bw.write("${n - k}\n")
        for (i in n downTo k) {
            bw.write("$i ")
        }
    } else {
        search()
    }

    bw.close()
    br.close()
}

fun search() {
    val queue = LinkedList<SooBin>()
    val arr = ArrayList<Int>()
    arr.add(n)
    queue.add(SooBin(arr, 0))

    while (queue.isNotEmpty()) {
        val now = queue.poll()
        map[now.location.last()] = true

        if (now.location.last() == k) {
            bw.write("${now.time}\n")
            now.location.forEach {
                bw.write("$it ")
            }
            return
        }

        if (now.location.last() * 2 in 0 until 100001) {
            if (!map[now.location.last() * 2]){
                map[now.location.last() * 2] = true
                val temp = now.location.clone() as ArrayList<Int>
                temp.add(now.location.last() * 2)
                queue.add(SooBin(temp, now.time + 1))
            }
        }

        if (now.location.last() - 1 in 0 until 100001) {
            if (!map[now.location.last() - 1]) {
                map[now.location.last() - 1] = true
                val temp = now.location.clone() as ArrayList<Int>
                temp.add(now.location.last() - 1)
                queue.add(SooBin(temp, now.time + 1))
            }
        }

        if (now.location.last() + 1 in 0 until 100001) {
            if (!map[now.location.last() + 1]) {
                map[now.location.last() + 1] = true
                val temp = now.location.clone() as ArrayList<Int>
                temp.add(now.location.last() + 1)
                queue.add(SooBin(temp, now.time + 1))
            }
        }
    }
}

data class SooBin (val location : ArrayList<Int>, val time : Int) : Comparable<SooBin> {
    override fun compareTo(other: SooBin): Int {
        return this.time - other.time
    }
}