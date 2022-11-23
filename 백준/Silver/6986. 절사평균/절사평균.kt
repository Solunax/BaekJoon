import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {
    val (n, k) = br.readLine().split(" ").map{ it.toInt() }
    val score = Array(n){0.0}
    repeat(n){
        score[it] = br.readLine().toDouble()
    }

    score.sort()
    val cut = score.slice(k until score.size-k)

    var sum = 0.0
    cut.forEach{
        sum += it
    }
    bw.write("%.2f\n".format(sum/cut.size))
    
    sum += k * cut.first()
    sum += k * cut.last()

    bw.write("%.2f".format(sum/n))

    bw.close()
    br.close()
}