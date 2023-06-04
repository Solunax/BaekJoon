import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (m, n) = br.readLine().split(" ").map { it.toInt() }
    val result = StringBuilder()

    if(m == 0)
        bw.write("0")
    else{
        while (m > 1){
            val num = m % n

            if(n > 10){
                if(num >= 10)
                    result.append('A' + (num - 10))
                else
                    result.append(num)
            }else
                result.append(num)

            m /= n
        }

        if(m != 0)
            result.append(m)

        bw.write("${result.reverse()}")
    }

    bw.close()
    br.close()
}