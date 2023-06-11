import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val line = Array(10000){0}

    repeat(br.readLine().toInt()){
        val (start, end) = br.readLine().split(" ").map{ it.toInt() }

        for(i in start until  end)
            line[i] = 1
    }

    var result = 0
    line.forEach {
        if(it == 1)
            result++
    }

    bw.write("$result")

    bw.close()
    br.close()
}