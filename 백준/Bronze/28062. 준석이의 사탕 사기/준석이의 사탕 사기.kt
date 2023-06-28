import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val candy = br.readLine().split(" ").map { it.toInt() }.sorted()

    var result = 0
    for(v in candy)
        result += v

    var index = 0
    while (result % 2 != 0 && index < n){
        if(candy[index] % 2 != 0)
            result -= candy[index]

        index++
    }

    bw.write("$result")

    bw.close()
    br.close()
}