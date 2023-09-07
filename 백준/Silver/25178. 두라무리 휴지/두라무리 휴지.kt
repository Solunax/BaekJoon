import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val str1 = br.readLine()
    val str2 = br.readLine()
    var check = true

    if(str1.first() != str2.first() || str1.last() != str2.last())
        check = false
    else{
        val sort1 = str1.toCharArray().sorted()
        val sort2 = str2.toCharArray().sorted()


        for(i in 0 until n){
            if(sort1[i] != sort2[i]){
                check = false
                break
            }
        }

        if(check){
            val rep1 = str1.replace("[aeiou]".toRegex(), "")
            val rep2 = str2.replace("[aeiou]".toRegex(), "")

            if(rep1 != rep2)
                check = false
        }else
            check = false
    }

    if(check)
        bw.write("YES")
    else
        bw.write("NO")

    bw.close()
    br.close()
}