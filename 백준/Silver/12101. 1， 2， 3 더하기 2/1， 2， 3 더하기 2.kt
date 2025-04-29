import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
var result = ArrayList<String>()

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    val k = input[1]
    search(0, "")
    
    if (result.size < k) {
        bw.write("-1")
    } else {
        bw.write(result[k - 1].trim().replace(' ', '+'))
    }

    bw.close()
    br.close()
}

fun search(num: Int, str: String) {
    if (num == n && str.length != 1) {
        result.add(str)
        return
    }

    if (num > n) {
        return
    }

    for (i in 1..3) {
        search(num + i, "$str$i ")
    }
}