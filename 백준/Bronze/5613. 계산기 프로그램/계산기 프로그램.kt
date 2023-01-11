import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var result = br.readLine().toInt()
    while (true){
        when(br.readLine()){
            "+" -> result += br.readLine().toInt()
            "-" -> result -= br.readLine().toInt()
            "*" -> result *= br.readLine().toInt()
            "/" -> result /= br.readLine().toInt()
            "=" -> {
                bw.write("$result")
                break
            }
        }
    }

    br.close()
    bw.close()
}