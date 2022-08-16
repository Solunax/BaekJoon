import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var input = br.readLine().split("").filter { it.isNotEmpty() }.map { it.toInt() }
    var count = 0
    var sum : Int

    while (input.size != 1){
        count++
        sum = 0
        input.forEach {
            sum += it
        }

        input = sum.toString().split("").filter { it.isNotEmpty() }.map { it.toInt() }
    }

    bw.write("$count\n")
    if(input[0] == 3 || input[0] == 6 || input [0] == 9)
        bw.write("YES")
    else
        bw.write("NO")

    bw.close()
    br.close()
}