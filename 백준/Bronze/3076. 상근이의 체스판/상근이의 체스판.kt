import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (r, c) = br.readLine().split(" ").map { it.toInt() }
    val (a, b) = br.readLine().split(" ").map { it.toInt() }
    val pattern1 = StringBuilder()
    val pattern2 = StringBuilder()

    var count = 0
    for(i in 0 until c * b){
        if(count < b){
            pattern1.append("X")
            pattern2.append(".")
        }
        else{
            pattern1.append(".")
            pattern2.append("X")
        }

        count++
        if(count == 2 * b)
            count = 0
    }

    count = 0
    for(i in 0 until  r * a){
        if(count < a)
            bw.write(pattern1.toString())
        else
            bw.write(pattern2.toString())
        bw.write("\n")

        count++
        if(count == 2 * a)
            count = 0
    }

    bw.close()
    br.close()
}