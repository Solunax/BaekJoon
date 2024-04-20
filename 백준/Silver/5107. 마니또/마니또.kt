import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<IntArray>
lateinit var visit: BooleanArray
var n = 0
var count = 0

fun main() {
    var index = 1
    while (true) {
        n = br.readLine().toInt()

        if (n == 0) {
            break
        }

        map = Array(n) { IntArray(n) }
        val name = ArrayList<String>()
        visit = BooleanArray(n)
        count = 0

        repeat(n) {
            val input = br.readLine().split(" ")

            repeat(2) {
                if (!name.contains(input[it])) {
                    name.add(input[it])
                }
            }

            map[name.indexOf(input[0])][name.indexOf(input[1])] = 1
        }

        for (i in 0 until n) {
            if (!visit[i]) {
                for (j in 0 until n) {
                    if (map[i][j] == 1 && !visit[j]) {
                        visit[i] = true
                        search(j)
                    }
                }
            }
        }

        bw.write("${index++} $count\n")
    }

    bw.close()
    br.close()
}

fun search(idx: Int) {
    visit[idx] = true

    for (i in 0 until n) {
        if (map[idx][i] == 1) {
            if (!visit[i]) {
                search(i)
            } else {
                count++
                break
            }
        }
    }
}
