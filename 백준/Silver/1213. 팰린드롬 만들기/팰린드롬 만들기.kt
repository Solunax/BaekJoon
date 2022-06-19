import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    val size = input.length

    val alphabet = Array(26){ 0 }
    for(i in 0 until size)
        alphabet[input[i] - 'A']++

    var check = 0
    for(i in alphabet.indices){
        if(alphabet[i] % 2 != 0)
            check++
    }

    if(check > 1)
        bw.write("I'm Sorry Hansoo")
    else{
        val sb = StringBuilder()
        for(i in alphabet.indices){
            for(j in 0 until alphabet[i] / 2)
                sb.append((i+65).toChar())
        }
        val string = sb.toString()
        val reverseString = sb.reverse().toString()
        sb.clear()
        for(i in alphabet.indices){
            if(alphabet[i] % 2 == 1)
                sb.append((i + 65).toChar())
        }

        bw.write("$string$sb$reverseString")
    }

    bw.close()
    br.close()
}