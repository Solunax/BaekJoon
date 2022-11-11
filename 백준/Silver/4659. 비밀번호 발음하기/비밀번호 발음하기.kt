import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val vowel = listOf('a', 'e', 'i', 'o', 'u')

fun main() {
    while(true){
        val pw = br.readLine()

        if(pw == "end")
            break

        var vowelCheck = false
        var correctCheck = true
        var vowelCount = 0
        var consonantCount = 0

        for(i in pw.indices){
            if(pw[i] in vowel){
                vowelCheck = true
                vowelCount++
                consonantCount = 0
            }else{
                consonantCount++
                vowelCount = 0
            }

            if(i > 0 && pw[i] == pw[i-1]){
                if(pw[i] == 'e' || pw[i] == 'o')
                    continue
                else{
                    correctCheck = false
                    break
                }
            }

            if(vowelCount == 3 || consonantCount == 3){
                correctCheck = false
                break
            }
        }

        if(vowelCheck && correctCheck)
            bw.write("<$pw> is acceptable.\n")
        else
            bw.write("<$pw> is not acceptable.\n")
    }

    bw.close()
    br.close()
}