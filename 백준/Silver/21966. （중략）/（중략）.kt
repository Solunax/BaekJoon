import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val str = br.readLine()

    if (n <= 25) {
        bw.write(str)
    } else {
        val checkStr = str.substring(11, n - 11)
        var checkIndex = 0
        var skipCheck = false

        for(i in 11 until  n - 11){
            if (str[i] == checkStr[checkIndex]) {
                checkIndex++

                if (checkIndex == checkStr.length - 1) {
                    skipCheck = true
                    break
                }
            } else {
                checkIndex = 0
            }

            if(str[i] == '.')
                break
        }

        if (skipCheck) {
            bw.write("${str.substring(0, 11)}...${str.substring(n - 11)}")
        } else {
            bw.write("${str.substring(0, 9)}......${str.substring(n - 10)}")
        }
    }

    bw.close()
    br.close()
}