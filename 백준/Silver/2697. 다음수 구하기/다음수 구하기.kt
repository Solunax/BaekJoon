import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val input = br.readLine()
        val size = input.length
        val num = Array(10){0}
        var isPossible = false

        for(i in size-1 downTo  1){
            if(input[i-1] < input[i]){
                isPossible = true
                for(j in i-1 until size)
                    num[input[j]-'0']++


                for(j in 0 until i-1)
                    bw.write("${input[j]}")

                for(j in input[i-1]-'0'+1 until 10){
                    if(num[j] > 0){
                        num[j]--
                        bw.write("$j")
                        break
                    }
                }

                for(j in 0 until 10){
                    while(num[j] > 0){
                        num[j]--
                        bw.write("$j")
                    }
                }
                bw.write("\n")
                break
            }
        }
        if(!isPossible)
            bw.write("BIGGEST\n")
    }

    bw.close()
    br.close()
}