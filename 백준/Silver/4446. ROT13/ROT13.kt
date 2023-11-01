import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val vowel = listOf('a', 'i', 'y', 'e', 'o', 'u')
    val consonant = listOf('b', 'k', 'x', 'z', 'n', 'h', 'd', 'c', 'w', 'g',
        'p', 'v', 'j', 'q', 't', 's', 'r', 'l', 'm', 'f')

    while(true){
        try {
            val input = br.readLine()
            val arr = input.toCharArray()
            val sb = StringBuilder()

            for (c in arr){
                val upperCheck = c in 'A' .. 'Z'
                when (c.lowercaseChar()) {
                    in vowel -> {
                        val newC = vowel[(vowel.indexOf(c.lowercaseChar()) + 3) % 6]
                        sb.append(if(upperCheck){
                            newC.uppercase()
                        } else {
                            newC
                        })
                    }
                    in consonant -> {
                        val newC = consonant[(consonant.indexOf(c.lowercaseChar()) + 10) % 20]
                        sb.append(if (upperCheck) {
                            newC.uppercase()
                        } else {
                            newC
                        })
                    }
                    else -> sb.append(c)
                }
            }

            bw.write("$sb\n")
        } catch (e : Exception) {
            break
        }
    }

    bw.close()
    br.close()
}