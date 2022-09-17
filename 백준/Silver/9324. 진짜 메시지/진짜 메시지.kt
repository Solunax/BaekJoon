import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val alpha = Array(26){0}
        val string = br.readLine()
        var flag = true

        var i = 0
        while(i < string.length) {
            val v = string[i] - 'A'
            alpha[v]++

            if (alpha[v] == 3) {
                if (string.length <= i + 1) {
                    flag = false
                    break
                } else if (string[i] == string[i + 1]) {
                    alpha[v] = 0
                    i++
                } else {
                    flag = false
                    break
                }
            }

            i++
        }

        if(flag)
            bw.write("OK\n")
        else
            bw.write("FAKE\n")
    }

    bw.close()
    br.close()
}