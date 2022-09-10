import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main(){
    repeat(br.readLine().toInt()){
        val n = br.readLine().toInt()
        var max = 0
        var name = ""
        repeat(n){
            val input = br.readLine().split(" ")

            if(max < input[0].toInt()){
                max = input[0].toInt()
                name = input[1]
            }
        }

        bw.write("$name\n")
    }

    bw.close()
    br.close()
}