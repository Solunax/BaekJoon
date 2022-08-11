import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        val input = br.readLine()

        if(input.isNullOrEmpty())
            break
        val check = Array(4){0}

        input.forEach {
            if(it.code >= 'a'.code && it.code <='z'.code)
                check[0]++
            else if(it.code >= 'A'.code && it.code <= 'Z'.code)
                check[1]++
            else if(it.code >= '0'.code && it.code <= '9'.code)
                check[2]++
            else
                check[3]++
        }

        check.forEach {
            bw.write("$it ")
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}