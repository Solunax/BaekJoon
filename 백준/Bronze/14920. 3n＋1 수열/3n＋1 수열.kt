import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var c = br.readLine().toInt()
    var result = 1

    while (true){
        if(c == 1)
            break

        result++
        if(c % 2 == 0)
            c /= 2
        else
            c = c * 3 + 1
    }

    bw.write("$result")

    br.close()
    bw.close()
}