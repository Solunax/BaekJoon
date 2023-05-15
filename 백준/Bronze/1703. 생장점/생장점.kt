import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        val input = br.readLine().split(" ").map{ it.toInt() }

        if(input[0] == 0)
            break

        var index = 1
        var result = 1
        for(i in 0 until input[0]){
            result *= input[index]
            result -= input[index + 1]
            index += 2
        }

        bw.write("$result\n")
    }

    bw.close()
    br.close()
}