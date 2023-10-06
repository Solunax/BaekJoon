import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().replace("::", ":skip:").split(":").filter { it.isNotEmpty() }
    val convert = ArrayList<String>()

    for(i in input.indices){
        var str = input[i]

        while(str.length < 4){
            str = "0$str"
        }

        convert.add(str)
    }

    var emptyLength = 8 - convert.size + 1
    val result = Array(8){""}
    var index = 0
    for(address in convert){
        if(address != "skip")
            result[index++] = address
        else{
            while(emptyLength > 0){
                result[index++] = "0000"
                --emptyLength
            }
        }
    }
    bw.write(result.joinToString(":"))

    bw.close()
    br.close()
}