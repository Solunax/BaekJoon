import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        val input = br.readLine().split(" ").map { it.toInt() }

        if(input[0] == 0)
            break

        var last = 0
        for(i in 1 until  input.size){
            if(last != input[i]){
                bw.write("${input[i]} ")
                last = input[i]
            }
        }
        bw.write("$\n")
    }

    br.close()
    bw.close()
}