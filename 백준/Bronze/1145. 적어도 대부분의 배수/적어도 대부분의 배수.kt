import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }.sorted()
    var result = input[0]

    while (true){
        var check = 0

        for(i in input){
            if(result % i == 0)
                check++
        }

        if(check >= 3)
            break

        result++
    }

    bw.write("$result")

    bw.close()
    br.close()
}