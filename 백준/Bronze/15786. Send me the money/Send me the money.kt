import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val(_, m) = br.readLine().split(" ").map { it.toInt() }
    val memory = br.readLine()

    repeat(m){

        var index = 0
        val input = br.readLine()
        var flag = false
        for(ch in input){
            if(ch == memory[index])
                index++

            if(index == memory.length){
                flag = true
                break
            }
        }

        if(flag)
            bw.write("true\n")
        else
            bw.write("false\n")
    }

    br.close()
    bw.close()
}