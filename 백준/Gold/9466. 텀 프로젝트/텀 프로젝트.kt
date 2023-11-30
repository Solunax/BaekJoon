import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<Int>
lateinit var visit: Array<Boolean>
lateinit var done: Array<Boolean>
var n = 0
var count = 0

fun main() {
    repeat(br.readLine().toInt()) {
        n = br.readLine().toInt()
        map = br.readLine().split(" ").map { it.toInt() - 1 }.toTypedArray()
        visit = Array(n) { false }
        done = Array(n) { false }
        count = 0

        for (i in 0 until n) {
            if(!done[i]){
                search(i)
            }
        }
        bw.write("${n - count}\n")
    }

    bw.close()
    br.close()
}

fun search(now: Int) {
    if (visit[now]) {
        return
    }

    visit[now] = true
    val next = map[now]

    if (!visit[next]) {
        search(next)
    } else {
        if (!done[next]) {
            var number = next
            count++
            while (number != now) {
                number = map[number]
                count++
            }
        }
    }

    done[now] = true
}