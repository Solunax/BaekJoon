import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var num: Array<Int>

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    num = Array(n + 1) { 0 }

    for (i in 0..n) {
        num[i] = i
    }

    repeat(m) {
        val (command, v1, v2) = br.readLine().split(" ").map { it.toInt() }
        when (command) {
            0 -> union(v1, v2)
            1 -> {
                if (find(v1) == find(v2)) {
                    bw.write("YES\n")
                } else {
                    bw.write("NO\n")
                }
            }
        }
    }

    bw.close()
    br.close()
}

fun union(a: Int, b: Int) {
    val v1 = find(a)
    val v2 = find(b)

    if (v1 > v2) {
        num[v1] = v2
    } else {
        num[v2] = v1
    }
}

fun find(x: Int): Int {
    return if (num[x] == x) {
        x
    } else {
        num[x] = find(num[x])
        num[x]
    }
}