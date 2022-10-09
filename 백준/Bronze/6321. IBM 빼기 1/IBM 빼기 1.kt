import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val input = br.readLine()
        bw.write("String #${it+1}\n")
        input.forEach { v ->
            var temp = v.code - 'A'.code + 65
            if(temp+1 > 90)
                temp = 65
            else
                temp += 1

            bw.write("${temp.toChar()}")
        }
        bw.write("\n\n")
    }


    bw.close()
    br.close()
}