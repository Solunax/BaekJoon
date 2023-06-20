import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        val input = br.readLine()

        if(input == "-1")
            break

        val arr = input.split(" ").map { it.toInt() }
        var result = 0

        arr.forEach {
            if(arr.contains(it * 2) && it != 0)
                result++
        }

        bw.write("$result\n")
    }

    bw.close()
    br.close()
}
