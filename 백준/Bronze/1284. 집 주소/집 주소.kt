import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true){
        val input = br.readLine()

        if(input == "0")
            break

        var result = 2 + input.length-1
        input.forEach {
            result += when(it){
                '0' -> 4
                '1' -> 2
                else -> 3
            }
        }

        bw.write("$result\n")
    }

    bw.close()
    br.close()
}