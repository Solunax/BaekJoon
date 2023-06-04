import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val vowel = listOf('a', 'e', 'i', 'o', 'u')

    while(true){
        val input = br.readLine()

        if(input == "#")
            break

        if(vowel.contains(input[0]))
            bw.write("${input}ay\n")
        else{
            var index = -1
            for(i in input.indices){
                if(vowel.contains(input[i])){
                    index = i
                    break
                }
            }

            if(index == -1)
                bw.write("${input}ay\n")
            else{
                val v1 = input.substring(0, index)
                val v2 = input.substring(index)
                bw.write("$v2${v1}ay\n")
            }
        }
    }

    bw.close()
    br.close()
}