import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.*

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
	var score = 0
	repeat(br.readLine().toInt()){
		val (a, d, g) = br.readLine().split(" ").map{ v -> v.toInt() }
		
		if(a == d + g)
			score = max(score, a * (d + g) * 2)
		else
			score = max(score, a * (d + g))
	}
	
	bw.write("$score")

    bw.close()
    br.close()
}
