import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val input = br.readLine()

        val result = StringBuilder()
        result.append(input[0])

        for(i in 1 until input.length){
            if(result.last() != input[i])
                result.append(input[i])
        }

        bw.write("$result\n")
    }

    bw.close()
    br.close()
}