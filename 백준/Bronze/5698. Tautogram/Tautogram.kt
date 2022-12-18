import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        val input = br.readLine().split(" ").map { it.lowercase() }

        if(input[0] == "*")
            break

        val text = input[0].first()
        var flag = true

        for(i in 1 until input.size){
            if(input[i].first() != text){
                flag = false
                break
            }
        }

        if(flag)
            bw.write("Y\n")
        else
            bw.write("N\n")
    }

    br.close()
    bw.close()
}