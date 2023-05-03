import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        var num = br.readLine().toInt()
        var max = num

        while(num != 1){
            if(num % 2 == 0)
                num /= 2
            else
                num = num * 3 + 1

            max = max(num, max)
        }

        bw.write("$max\n")
    }

    bw.close()
    br.close()
}