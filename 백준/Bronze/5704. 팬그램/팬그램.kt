import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        val input = br.readLine()

        if(input == "*")
            break

        val alpha = Array(26){0}

        input.forEach {
            if(it != ' ')
                alpha[it-'a']++
        }

        var flag = true
        for(i in alpha.indices){
            if(alpha[i] == 0){
                flag = false
                break
            }
        }

        if (flag)
            bw.write("Y\n")
        else
            bw.write("N\n")
    }

    br.close()
    bw.close()
}