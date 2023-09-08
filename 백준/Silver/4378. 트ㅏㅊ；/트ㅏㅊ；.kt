import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val correct = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./"
    while(true){
        val input = br.readLine()

        if(input.isNullOrEmpty())
            break

        val sb = StringBuilder()
        for(c in input){
            if(c != ' ')
                sb.append("${correct[correct.indexOf(c) - 1]}")
            else
                sb.append(' ')
        }

        bw.write("$sb\n")
    }

    bw.close()
    br.close()
}