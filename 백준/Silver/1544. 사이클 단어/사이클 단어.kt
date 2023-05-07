import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val word = ArrayList<String>()

    repeat(n){
        val str = br.readLine()
        var check = false

        for(j in 0 until word.size){
            if(word[j].length == str.length){
                if(compareWord(word[j], str)){
                    check = true
                    break
                }
            }
        }

        if(!check)
            word.add(str)
    }
    bw.write("${word.size}")

    bw.close()
    br.close()
}

fun compareWord(v1 : String, v2 : String) : Boolean {
    var sb = StringBuilder()
    var check = true
    sb.append(v2)

    for(i in v1.indices){
        check = true

        for(j in v1.indices){
            if(sb[j] != v1[j]){
                check = false
                break
            }
        }

        if(check)
            break

        sb = sb.append(sb[0]).deleteCharAt(0)
    }

    return check
}