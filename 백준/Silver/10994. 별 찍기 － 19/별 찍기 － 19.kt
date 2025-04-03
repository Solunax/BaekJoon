import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var arr: Array<CharArray>

fun main() {
    val n = br.readLine().toInt()
    arr = Array(4 * (n - 1) + 1) { CharArray(4 * (n - 1) + 1) { ' ' } }

    draw(0, n)
    repeat(4 * (n - 1) + 1) {
        bw.write("${arr[it].concatToString()}\n")
    }

    bw.close()
    br.close()
}

fun draw(s: Int, e: Int) {
    if (e <= 0) {
        return
    }

    val c = 4 * (e - 1)
    for (i in s .. s + c) {
        arr[s][i] = '*'
        arr[i][s] = '*'
        arr[s + c][i] = '*'
        arr[i][s + c] = '*'
    }
    draw(s + 2, e - 1)
}