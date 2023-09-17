import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val str = br.readLine()

        if(str.length == 7){
            if(str[0] == str[1] &&
                str[0] == str[4] &&
                str[2] == str[3] &&
                str[2] == str[5] &&
                str[2] == str[6] &&
                str[0] != str[6])
                bw.write("1\n")
            else
                bw.write("0\n")
        } else
            bw.write("0\n")
    }

    bw.close()
    br.close()
}