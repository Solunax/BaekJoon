import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val str = br.readLine()

        if(checkPalindrome(str.lowercase()))
            bw.write("Yes\n")
        else
            bw.write("No\n")
    }

    bw.close()
    br.close()
}

fun checkPalindrome(str : String) : Boolean{
    val len = str.length

    for(i in 0 until len/2){
        if(str[i] != str[len - 1 - i])
            return false
    }

    return true
}