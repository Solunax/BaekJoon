import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val room = br.readLine().split(" ").map { it.toInt() }.toMutableList()
    val (b, c) = br.readLine().split(" ").map{ it.toInt() }

    var result = 0L
    repeat(n){
        room[it] -= b
        if(room[it] > 0){
            result += room[it] / c
            room[it] %= c
            if(room[it] != 0)
                result += 1
        }
        result += 1
    }

    bw.write("$result")

    bw.close()
    br.close()
}