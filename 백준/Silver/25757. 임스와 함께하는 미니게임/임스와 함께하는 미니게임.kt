import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split(" ")
    val n = input[0].toInt()
    val t = when(input[1]){
        "Y" -> 1
        "F" -> 2
        "O" -> 3
        else -> 0
    }

    val set = HashSet<String>()
    repeat(n){
        set.add(br.readLine())
    }
    bw.write("${set.size / t}")

    bw.close()
    br.close()
}