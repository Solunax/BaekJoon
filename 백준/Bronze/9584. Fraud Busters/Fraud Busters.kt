import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val code = br.readLine()
    val result = ArrayList<String>()

    repeat(br.readLine().toInt()) {
        var check = true
        val str = br.readLine()
        for (i in 0 until 9){
            if (code[i] != '*') {
               if (code[i] != str[i]) {
                   check = false
                   break
               }
            }
        }

        if(check)
            result.add(str)
    }

    bw.write("${result.size}\n")
    result.forEach {
        bw.write("$it\n")
    }

    bw.close()
    br.close()
}