import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val inputString = br.readLine()
val check = Array(inputString.length){Array(26){0}}
val case = br.readLine().toInt()

fun main() {
    check[0][inputString[0] - 'a']++

    for(i in 1 until inputString.length){
        val value = inputString[i] - 'a'

        for(j in 0 until 26)
            check[i][j] = check[i - 1][j]

        check[i][value]++
    }

    for(i in 0 until case){
        val question = br.readLine().split(" ")

        if(question[1].toInt() == 0)
            bw.write("${check[question[2].toInt()][question[0][0] - 'a']}\n")
        else
            bw.write("${check[question[2].toInt()][question[0][0] - 'a'] - check[question[1].toInt() - 1][question[0][0] - 'a']}\n")
    }
    bw.flush()
    br.close()
    bw.close()
}