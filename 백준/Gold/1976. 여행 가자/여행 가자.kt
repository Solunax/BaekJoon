import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var nodes : Array<Int>

fun main() {
    val n = br.readLine().toInt()
    val m = br.readLine().toInt()
    nodes = Array(n + 1){0}

    for (i in 1 .. n) {
        nodes[i] = i
    }

    for (i in 0 until n) {
        val route = br.readLine().split(" ").map { it.toInt() }

        for (j in 0 until n) {
            if (route[j] == 1) {
                union(i + 1, j + 1)
            }
        }
    }

    val plan = br.readLine().split(" ").map { it.toInt() }
    var check = true
    for (i in 1 until m) {
        if (nodes[plan[0]] != nodes[plan[i]]) {
            check = false
            break
        }
    }

    if (check) {
        bw.write("YES")
    } else {
        bw.write("NO")
    }

    bw.close()
    br.close()
}

fun union (x : Int, y : Int) {
    val v1 = find(x)
    val v2 = find(y)

    if (v1 > v2) {
        nodes[v1] = v2
    } else {
        nodes[v2] = v1
    }
}

fun find (x : Int) : Int {
    return if (nodes[x] == x)
        x
    else{
        nodes[x] = find(nodes[x])
        nodes[x]
    }
}