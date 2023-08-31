import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val str = br.readLine()

        if(str.endsWith("a") || str.endsWith("o") || str.endsWith("u"))
            bw.write("${str}s\n")
        else if(str.endsWith("r") || str.endsWith("l") || str.endsWith("v"))
            bw.write("${str}es\n")
        else if(str.endsWith("t") || str.endsWith("w"))
            bw.write("${str}as\n")
        else if(str.endsWith("i"))
            bw.write("${str}os\n")
        else if(str.endsWith("y"))
            bw.write("${str.substring(0, str.length - 1)}ios\n")
        else if(str.endsWith("n"))
            bw.write("${str.substring(0, str.length - 1)}anes\n")
        else if(str.endsWith("ne"))
            bw.write("${str.substring(0, str.length - 2)}anes\n")
        else
            bw.write("${str}us\n")
    }

    bw.close()
    br.close()
}