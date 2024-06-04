import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val arr = IntArray(n + 1)
        val visit = BooleanArray(n + 1)

        repeat(n) {
            arr[it + 1] = br.readLine().toInt()
        }

        var next = arr[1]
        var count = 1
        var check = true
        visit[1] = true

        while (true) {
            if (next == n) {
                break
            }

            if (visit[arr[next]]) {
                check = false
                break
            }

            next = arr[next]
            visit[next] = true
            count++
        }

        if (check) {
            bw.write("$count\n")
        } else {
            bw.write("0\n")
        }
    }

    bw.close()
    br.close()
}