import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var parent: IntArray

fun main() {
    val n = br.readLine().toInt()
    parent = IntArray(n + 1)

    for (i in 1..n) {
        parent[i] = i
    }

    repeat(n - 2) {
        val (s, e) = br.readLine().split(" ").map { it.toInt() }
        union(s, e)
    }

    for (i in 2..n) {
        if (!parentCheck(1, i)) {
            bw.write("1 $i")
            break
        }
    }

    bw.close()
    br.close()
}

fun union(x: Int, y: Int) {
    val nx = find(x)
    val ny = find(y)

    if (nx != ny) {
        if (nx < ny) {
            parent[ny] = nx
        } else {
            parent[nx] = ny
        }
    }
}

fun find(x: Int): Int {
    return if (parent[x] == x) {
        x
    } else {
        parent[x] = find(parent[x])
        parent[x]
    }
}

fun parentCheck(v1: Int, v2: Int): Boolean {
    return find(v1) == find(v2)
}