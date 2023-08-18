import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val input = br.readLine().split("").filter { it.isNotEmpty() }.toTypedArray()

    for(i in 0 until n / 2){
        if(input[i] == "?"){
            if(input[n - 1 - i] != "?")
                input[i] = input[n - 1 - i]
            else{
                input[i] = "a"
                input[n - 1 - i] = "a"
            }
        }

        if(input[n - 1 - i] == "?"){
            if(input[i] != "?")
                input[n - 1 - i] = input[i]
            else{
                input[i] = "a"
                input[n - 1 - i] = "a"
            }
        }
    }

    if(n % 2 == 1 && input[n / 2] == "?")
        input[n / 2] = "a"

    input.forEach {
        bw.write(it)
    }

    bw.close()
    br.close()
}