import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b, c) = br.readLine().split(" ").map { it.toInt() }
    val time = Array(101){0}

    repeat(3){
        val input = br.readLine().split(" ").map { it.toInt() }
        val inTime = input[0]
        val outTime = input[1]-1

        for(t in inTime..outTime)
            time[t]++
    }

    var result = 0
    time.forEach {
        when (it){
            1 -> result += a
            2 -> result += (b * 2)
            3 -> result += (c * 3)
        }
    }
    bw.write("$result")

    br.close()
    bw.close()
}