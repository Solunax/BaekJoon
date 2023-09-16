import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var result = ""

    while (true){
        val input = br.readLine().lowercase().split("[^a-z-]".toRegex())

        for(str in input){
            if(str == "e-n-d"){
                bw.write(result)
                bw.close()
                br.close()
                
                return
            }

            if(str.length > result.length)
                result = str
        }
    }
}