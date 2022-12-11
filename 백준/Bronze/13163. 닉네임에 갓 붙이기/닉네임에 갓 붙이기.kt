import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val input = br.readLine().split(" ")

        bw.write("god")
        for(i in 1 until input.size)
            bw.write(input[i])
        bw.write("\n")
    }

    br.close()
    bw.close()
}