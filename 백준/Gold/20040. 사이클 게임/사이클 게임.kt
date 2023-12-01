import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var player: Array<Int>

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    var result = 0
    player = Array(n) { 0 }

    repeat(n) {
        player[it] = it
    }

    for (i in 0 until m) {
        val (v1, v2) = br.readLine().split(" ").map { it.toInt() }

        if (find(v1) == find(v2)) {
            result = i + 1
            break
        } else {
            union(v1, v2)
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}

fun union(a: Int, b: Int) {
    val v1 = find(a)
    val v2 = find(b)

    if (v1 > v2) {
        player[v1] = v2
    } else {
        player[v2] = v1
    }
}

fun find(x: Int): Int {
    return if (player[x] == x) {
        x
    } else {
        player[x] = find(player[x])
        player[x]
    }
}