import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map{ it.toInt() }
    val child = br.readLine().split(" ").map { it.toInt() }

    val diff = Array(n - 1){0}
    repeat(n - 1){
        diff[it] = child[it + 1] - child[it]
    }
    diff.sort()

    var result = 0
    repeat(n - k){
        result += diff[it]
    }
    bw.write("$result")
    bw.close()
    br.close()
}