import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val room = Array(n-1){1}
    val m = br.readLine().toInt()

    repeat(m){
        val (left, right) = br.readLine().split(" ").map { it.toInt() - 1}
        for(idx in left until  right)
            room[idx] = 0
    }

    var count = 1
    for(i in room.indices){
        if(room[i] == 1)
            count++
    }

    bw.write("$count")

    bw.close()
    br.close()
}