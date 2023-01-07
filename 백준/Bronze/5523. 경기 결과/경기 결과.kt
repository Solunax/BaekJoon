import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var a = 0
    var b = 0

    repeat(br.readLine().toInt()){
        val(aScore, bScore) = br.readLine().split(" ").map { it.toInt() }

        if(aScore > bScore)
            a++
        else if(bScore > aScore)
            b++
    }
    bw.write("$a $b")

    br.close()
    bw.close()
}