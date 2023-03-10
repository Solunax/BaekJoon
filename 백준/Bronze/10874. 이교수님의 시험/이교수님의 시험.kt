import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        var check = true
        val input = br.readLine().split(" ").map { v -> v.toInt() }
        var index = 1

        for(i in input){
            if((index - 1) % 5 + 1 != i){
                check = false
                break
            }
            index++
        }

        if(check)
            bw.write("${it+1}\n")
    }

    br.close()
    bw.close()
}