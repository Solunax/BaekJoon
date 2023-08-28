import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var count = 1
    
    while (true){
        count++

        val input = br.readLine()

        if(input == "Was it a cat I saw?")
            break

        for(i in input.indices step count)
            bw.write("${input[i]}")
        bw.write("\n")
    }

    bw.close()
    br.close()
}
