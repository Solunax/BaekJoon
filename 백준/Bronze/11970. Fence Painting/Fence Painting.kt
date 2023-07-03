import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val fence = Array(101){0}

    repeat(2){
        val (a, b) = br.readLine().split(" ").map { it.toInt() }

        for(i in a until b)
            fence[i]++
    }

    var result = 0
    fence.forEach {
        if(it > 0)
            result++
    }

    bw.write("$result")

    bw.close()
    br.close()
}