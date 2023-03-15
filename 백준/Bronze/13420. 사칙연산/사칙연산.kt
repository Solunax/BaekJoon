import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val (a, operator, b, _, result) = br.readLine().split(" ")
        val v1 = a.toLong()
        val v2 = b.toLong()
        val res = result.toLong()

        val check = when(operator){
            "+" -> v1 + v2 == res
            "-" -> v1 - v2 == res
            "*" -> v1 * v2 == res
            "/" -> v1 / v2 == res
            else -> false
        }

        if(check)
            bw.write("correct\n")
        else
            bw.write("wrong answer\n")
    }

    br.close()
    bw.close()
}