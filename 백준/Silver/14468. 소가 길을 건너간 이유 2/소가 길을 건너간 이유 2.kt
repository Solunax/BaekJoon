import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    var result = 0

    for(i in 0 until 52){
        for(j in i + 1 until 52){
            if(input[i] == input[j]){
                val temp = input.substring(i, j + 1)

                for(cow in temp){
                    if(temp.count { it == cow } == 1)
                        result++
                }
                break
            }
        }
    }
    bw.write("${result / 2}")

    bw.close()
    br.close()
}