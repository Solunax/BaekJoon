import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map{ it.toInt() }
    val words = Array(n){""}

    repeat(n){
        words[it] = br.readLine()
    }

    var result = 0
    repeat(m){
        val input = br.readLine()
        for(i in 0 until n){
            if(words[i].substring(0, input.length) == input){
                result++
                break
            }
        }
    }

    bw.write("$result")

    br.close()
    bw.close()
}