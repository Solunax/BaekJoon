import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var arr: IntArray
lateinit var visit: BooleanArray
var find = false

fun main() {
    arr = IntArray(9)
    visit = BooleanArray(9)

    repeat(9) {
        arr[it] = br.readLine().toInt()
    }

    for (i in 0 until 9) {
        if (!find) {
            visit[i] = true
            getNumber(arr[i], 1)
            visit[i] = false
        }
    }

    bw.close()
    br.close()
}

fun getNumber(sum: Int, count: Int) {
    if (count == 7) {
        if (sum == 100 && !find) {
            for (i in 0 until 9) {
                if (visit[i]) {
                    bw.write("${arr[i]}\n")
                }
            }
            find = true
        }

        return
    }

    for (i in 0 until 9) {
        if (!visit[i]) {
            visit[i] = true
            getNumber(sum + arr[i], count + 1)
            visit[i] = false
        }
    }
}