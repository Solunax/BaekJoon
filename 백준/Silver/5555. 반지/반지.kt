import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
fun main() {
    val origin = br.readLine()
    var result = 0

    repeat(br.readLine().toInt()){
        var input = br.readLine()
        input += input

        if(input.contains(origin))
            result++
    }

    bw.write("$result")

    br.close()
    bw.close()
}