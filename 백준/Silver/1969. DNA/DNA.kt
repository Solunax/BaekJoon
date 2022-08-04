import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val array = Array(n){""}
    val dna = Array(4){0}
    var max = 0
    var result = 0

    for(i in 0 until n)
        array[i] = br.readLine()

    for(i in 0 until m){
        for(j in 0 until 4)
            dna[j] = 0

        for(j in 0 until n){
            when(array[j][i]){
                'A' -> dna[0]++
                'C' -> dna[1]++
                'G' -> dna[2]++
                'T' -> dna[3]++
            }
        }

        for(j in 0 until 4)
            max = max(max, dna[j])

        for(j in 0 until 4){
            if(dna[j] == max){
                when(j){
                    0 -> {bw.write("A")}
                    1 -> {bw.write("C")}
                    2 -> {bw.write("G")}
                    3 -> {bw.write("T")}
                }
                break
            }
        }

        result += (n - max)
        max = 0
    }

    bw.write("\n$result")
    bw.close()
    br.close()
}
