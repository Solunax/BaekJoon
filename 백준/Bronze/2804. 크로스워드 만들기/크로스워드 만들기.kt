import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (s1, s2) = br.readLine().split(" ")
    var pointX = 0
    var pointY = 0
    var flag = false

    for(i in s1.indices){
        for(j in s2.indices){
            if(s1[i] == s2[j]){
                pointX = i
                pointY = j
                flag = true
                break
            }
        }
        if(flag)
            break
    }

    for(i in s2.indices){
        for(j in s1.indices){
            if(i == pointY)
                bw.write("${s1[j]}")
            else if(j == pointX)
                bw.write("${s2[i]}")
            else
                bw.write(".")
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}