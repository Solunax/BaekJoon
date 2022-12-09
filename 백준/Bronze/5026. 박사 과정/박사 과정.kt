import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val input = br.readLine()

        if(input =="P=NP")
            bw.write("skipped\n")
        else{
            val(a, b) = input.split("+").map { it.toInt() }

            bw.write("${a+b}\n")
        }
    }

    br.close()
    bw.close()
}