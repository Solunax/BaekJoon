import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val input = br.readLine().split(" ")

        for(i in 2 until input.size)
            bw.write("${input[i]} ")

        bw.write("${input[0]} ${input[1]}\n")
    }

    br.close()
    bw.close()
}