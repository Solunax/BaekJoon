import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val case = br.readLine().toInt()
    var alpha : Array<Int>
    var sum : Int
    repeat(case){
        sum = 0
        alpha = Array(26){0}
        val input = br.readLine()
        input.forEach { c ->
            alpha[c - 'A']++
        }

        for(i in 0 until 26){
            if(alpha[i] == 0)
                sum += i + 65
        }
        bw.write("$sum\n")
    }

    bw.close()
    br.close()
}