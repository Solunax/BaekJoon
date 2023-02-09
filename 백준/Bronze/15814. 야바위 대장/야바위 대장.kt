import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split("").filter { it.isNotEmpty() }.toMutableList()

    repeat(br.readLine().toInt()){
        val (v1, v2) = br.readLine().split(" ").map { it.toInt() }

        input[v1] = input[v2].also { input[v2] = input[v1] }
    }

    input.forEach {
        bw.write(it)
    }

    br.close()
    bw.close()
}