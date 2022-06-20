import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    val list = listOf('U', 'C', 'P', 'C')

    var index = 0

    for(i in input.indices){
        if(input[i] == list[index])
            index++

        if(index == 4){
            bw.write("I love UCPC")
            break
        }
    }

    if(index < 4)
        bw.write("I hate UCPC")

    bw.close()
    br.close()
}