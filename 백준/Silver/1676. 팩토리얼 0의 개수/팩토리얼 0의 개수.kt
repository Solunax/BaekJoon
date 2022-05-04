import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    var input = br.readLine().toInt()

    var result = 0

    while (input >= 5){
        result += input / 5
        input /= 5
    }

    bw.write("$result")
    bw.flush()

    br.close()
    bw.close()
}