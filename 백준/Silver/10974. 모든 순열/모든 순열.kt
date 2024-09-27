import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
val num = IntArray(9)
val visit = BooleanArray(9)

fun main() {
    n = br.readLine().toInt()
    search(0)

    bw.close()
    br.close()
}

fun search(idx: Int) {
    if (idx == n) {
        for (i in 0 until n) {
            bw.write("${num[i]} ")
        }
        bw.write("\n")
        return
    }

    for (i in 0 until n) {
        if (!visit[i]) {
            visit[i] = true
            num[idx] = i + 1
            search(idx + 1)
            visit[i] = false
        }
    }
}