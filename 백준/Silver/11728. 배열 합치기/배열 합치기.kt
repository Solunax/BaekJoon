import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val arr1 = br.readLine().split(" ").map { it.toInt() }
    val arr2 = br.readLine().split(" ").map { it.toInt() }

    (arr1 + arr2).sorted().forEach {
        bw.write("$it ")
    }

    bw.close()
    br.close()
}