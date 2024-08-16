import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val map = HashMap<String, ArrayList<String>>()

fun main() {
    val n = br.readLine().toInt()

    repeat(n - 1) {
        val (a, b) = br.readLine().split(" ")

        if (!map.containsKey(a)) {
            map[a] = ArrayList()
        }

        map[a]!!.add(b)
    }

    val (searchA, searchB) = br.readLine().split(" ")

    if (search(searchA, searchB) || search(searchB, searchA)) {
        bw.write("1")
    } else {
        bw.write("0")
    }

    bw.close()
    br.close()
}

fun search(now: String, end: String): Boolean {
    if (now == end) {
        return true
    }

    if (map[now] == null) {
        return false
    }

    for (next in map[now]!!) {
        if (search(next, end)) {
            return true
        }
    }

    return false
}