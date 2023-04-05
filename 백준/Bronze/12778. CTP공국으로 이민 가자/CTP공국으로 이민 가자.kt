import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val(_, type) = br.readLine().split(" ")

        when(type){
            "C" -> {
                val input = br.readLine().toCharArray()

                input.forEach {
                    if(it != ' ')
                        bw.write("${it - 'A' + 1} ")
                }
                bw.write("\n")
            }
            "N" -> {
                val input = br.readLine().split(" ").map { it.toInt() }

                input.forEach {
                    bw.write("${(it + 'A'.code - 1).toChar()} ")
                }
                bw.write("\n")
            }
        }
    }

    br.close()
    bw.close()
}