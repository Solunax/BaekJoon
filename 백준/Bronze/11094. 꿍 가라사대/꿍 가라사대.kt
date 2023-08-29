import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val input = br.readLine()

        if(input.startsWith("Simon says"))
            bw.write("${input.replace("Simon says", "")}\n")
    }

    bw.close()
    br.close()
}