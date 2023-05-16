import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    for(i in 1000 .. 9999){
        var sum0 = 0
        var sum1 = 0
        var sum2 = 0

        var num = i
        while(num > 0){
            sum0 += num % 10
            num /= 10
        }
        
        num = i
        while(num > 0){
            sum1 += num % 12
            num /= 12
        }

        num = i
        while(num > 0){
            sum2 += num % 16
            num /= 16
        }

        if(sum0 == sum1 && sum1 == sum2)
            bw.write("$i\n")
    }

    bw.close()
    br.close()
}