import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var input = br.readLine()
    when(input.length % 3){
        1 -> { input = "00$input" }
        2 -> { input = "0$input" }
    }

    val sb = StringBuilder()
    for(i in input.indices step 3){
        when(input.substring(i, i+3)){
            "000" -> sb.append("0")
            "001" -> sb.append("1")
            "010" -> sb.append("2")
            "011" -> sb.append("3")
            "100" -> sb.append("4")
            "101" -> sb.append("5")
            "110" -> sb.append("6")
            "111" -> sb.append("7")
        }
    }
    bw.write(sb.toString())

    br.close()
    bw.close()
}