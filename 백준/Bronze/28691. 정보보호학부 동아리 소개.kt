import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    bw.write("${when(br.readLine()){
		"M"	-> "MatKor"
		"W" -> "WiCys"
		"C" -> "CyKor"
		"A" -> "AlKor"
		"$" -> "\$clear"
		else -> ""
		}
	}")

    
    bw.close()
    br.close()
}
