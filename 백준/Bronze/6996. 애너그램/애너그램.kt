import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val case = br.readLine().toInt()

    repeat(case){
        val (s1, s2) = br.readLine().split(" ")
        val check1 = Array(26){0}
        val check2 = Array(26){0}
        var flag = true

        s1.forEach {
            check1[it - 'a']++
        }

        s2.forEach {
            check2[it - 'a']++
        }

        for(i in 0 until 26){
            if(check1[i] != check2[i]){
                flag = false
                break
            }
        }

        if(flag)
            bw.write("$s1 & $s2 are anagrams.\n")
        else
            bw.write("$s1 & $s2 are NOT anagrams.\n")
    }

    bw.close()
    br.close()
}