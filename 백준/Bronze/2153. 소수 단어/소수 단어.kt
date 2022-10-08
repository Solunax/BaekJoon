import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()

    var sum = 0
    input.forEach {
        sum += if(it in 'a' .. 'z')
            (it.code - 'a'.code) + 1
        else
            (it.code - 'A'.code) + 27
    }

    var isPrime = true
    for(i in 2 until sum){
        if(sum % i == 0){
            isPrime = false
            break
        }
    }

    if(isPrime)
        bw.write("It is a prime word.")
    else
        bw.write("It is not a prime word.")


    bw.close()
    br.close()
}