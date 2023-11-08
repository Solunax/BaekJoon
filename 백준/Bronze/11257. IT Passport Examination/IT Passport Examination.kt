import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val (num, a, b, c) = br.readLine().split(" ").map { it.toInt() }
        val sb = StringBuilder()
        sb.append("$num ${a + b +c} ")

        if(a > 10.5 && b > 7.2 && c >= 12 && a + b + c >= 55){
            sb.append("PASS\n")
        } else {
            sb.append("FAIL\n")
        }

        bw.write(sb.toString())
    }

    bw.close()
    br.close()
}