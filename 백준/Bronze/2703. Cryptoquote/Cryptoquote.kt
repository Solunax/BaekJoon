import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val encrypt = br.readLine()
        val rule = br.readLine()

        encrypt.forEach {
            if(it == ' ')
                bw.write(" ")
            else
                bw.write("${rule[it - 'A']}")
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}