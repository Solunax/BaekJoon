import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val check = HashSet<Char>()
    val n = br.readLine().toInt()

    for(i in 0 until n){
        val input = br.readLine()
        val arr = input.split(" ")
        var flag = true
        val sb = StringBuilder()

        for(str in arr){
            val c = str[0]
            if(flag && !check.contains(c.lowercaseChar()) && c != ' '){
                check.add(c.lowercaseChar())
                sb.append("[$c]${str.substring(str.indexOf(c) + 1)} ")
                flag = false
            }else
                sb.append("$str ")
        }

        if(!flag)
            bw.write("$sb\n")
        else{
            sb.clear()

            for(j in input.indices){
                if(flag && !check.contains(input[j].lowercaseChar()) && input[j] != ' '){
                    check.add(input[j].lowercaseChar())
                    sb.append("[${input[j]}]")
                    flag = false
                }else
                    sb.append("${input[j]}")
            }
            bw.write("$sb\n")
        }
    }

    br.close()
    bw.close()
}