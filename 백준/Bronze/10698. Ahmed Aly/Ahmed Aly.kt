import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val input = br.readLine().split(" ")
        val result = when (input[1]) {
            "+" -> input[0].toInt() + input[2].toInt() == input[4].toInt()
            "-" -> input[0].toInt() - input[2].toInt() == input[4].toInt()
            else -> false
        }

        bw.write("Case ${it + 1}: ${if(result){
                "YES"
            } else {
                "NO"
            }
        }\n"
        )
    }

    bw.close()
    br.close()
}
