import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        br.readLine()
        val input = br.readLine().split(" ").map{ it.toInt() }
        var max = -10000001
        var min = 1000001

        input.forEach {
            if(it > max)
                max = it

            if(it < min)
                min = it
        }

        bw.write("$min $max\n")

    }

    br.close()
    bw.close()
}