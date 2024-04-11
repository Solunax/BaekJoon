import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
	br.readLine()
	bw.write("1\n0")
	
	bw.close()
	br.close()
}
