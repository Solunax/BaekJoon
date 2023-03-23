import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        var (a, b) = br.readLine().split(" ")

        if(a == "0" && b == "0")
            break

        if(b.length > a.length)
            a = b.also { b = a }

        bw.write("${getCarry(a.reversed(), b.reversed())}\n")
    }

    br.close()
    bw.close()
}

fun getCarry(a : String, b : String) : Int{
    val bLen = b.length
    var carry = 0
    var count = 0
    var sum : Int

    for(i in a.indices){
        val v1 = a[i] - '0'
        sum = v1

        if(carry != 0){
            sum += 1
            carry = 0
        }

        if(i < bLen)
            sum += b[i] - '0'

        if(sum >= 10){
            carry = 1
            count++
        }
    }

    return count
}