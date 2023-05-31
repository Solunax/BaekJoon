import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = StringTokenizer(br.readLine())
    val skip = listOf("i", "pa" ,"te" ,"ni" ,"niti" ,"a" ,"ali" ,"nego" ,"no" ,"ili")

    bw.write("${input.nextToken().uppercase()[0]}")
    while (input.hasMoreTokens()){
        val temp = input.nextToken()

        if(skip.contains(temp))
            continue

        bw.write("${temp.uppercase()[0]}")
    }


    bw.close()
    br.close()
}