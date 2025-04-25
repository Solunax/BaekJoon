import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var k = 0
lateinit var arr: List<String>
lateinit var visit: BooleanArray
var result = ArrayList<String>()

fun main() {
    k = br.readLine().toInt() + 1
    arr = br.readLine().split(" ")

    for (i in 0..9) {
        visit = BooleanArray(10)
        visit[i] = true
        search(i, 0, "$i")
        visit[i] = false
    }

    bw.write("${result.last()}\n${result.first()}")

    bw.close()
    br.close()
}

fun search(last: Int, d: Int, str: String) {
    if (str.length == k) {
        result.add(str)
        return
    }

    for (i in 0..9) {
        if (!visit[i]){
            when (arr[d]) {
                ">" -> {
                    if (last > i) {
                        visit[i] = true
                        search(i, d + 1, str + i)
                        visit[i] = false
                    }
                }
                "<" -> {
                    if (last < i) {
                        visit[i] = true
                        search(i, d + 1, str + i)
                        visit[i] = false
                    }
                }
            }
        }
    }
}