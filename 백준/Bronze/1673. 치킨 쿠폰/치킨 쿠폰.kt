import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        val input = br.readLine()

        if(input.isNullOrEmpty())
            break

        var result = 0
        var (coupon, require) = input.split(" ").map { it.toInt() }
        var stamp = 0
        while(coupon != 0){
            result += coupon
            stamp +=  coupon
            coupon = 0

            coupon += stamp / require
            stamp %= require
        }
        
        bw.write("$result\n")
    }

    br.close()
    bw.close()
}