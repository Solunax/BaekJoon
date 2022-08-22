import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val case = br.readLine().toInt()

    repeat(case){
        val input = br.readLine()

        if((input.last() - '0') % 2 == 0)
            bw.write("even\n")
        else
            bw.write("odd\n")
    }

    bw.close()
    br.close()
}