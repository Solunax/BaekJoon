import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val str = br.readLine().split("(?=[A-Z])".toRegex())
    var result = 0

    for(i in 1 until str.size - 1){
        val temp = str[i].length % 4

        if(temp != 0)
            result += 4 - temp
    }

    bw.write("$result")

    bw.close()
    br.close()
}