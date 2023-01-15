import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var aScore = 100
    var bScore = 100

    repeat(br.readLine().toInt()){
        val (a, b) = br.readLine().split(" ").map { it.toInt() }

        if(a > b)
            bScore -= a
        else if(b > a)
            aScore -= b
    }
    bw.write("$aScore\n$bScore")

    br.close()
    bw.close()
}
