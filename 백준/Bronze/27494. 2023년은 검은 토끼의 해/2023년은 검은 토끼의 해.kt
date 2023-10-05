import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val check = listOf('2', '0', '2', '3')
    val n = br.readLine().toInt()
    var result = 0

    if(n >= 2023){
        for(i in 2023 .. n){
            var index = 0
            val str = i.toString()

            for(j in str.indices){
                if(str[j] == check[index])
                    index++

                if(index == 4)
                    break
            }

            if(index == 4)
                result++
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}