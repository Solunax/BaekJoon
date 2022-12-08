import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        if(check(br.readLine().reversed()))
            bw.write("T\n")
        else
            bw.write("F\n")
    }

    br.close()
    bw.close()
}

fun check(str : String) : Boolean{
    var sum = 0
    for(i in str.indices){
        var num = str[i]-'0'
        if((i+1)%2 == 0) {
            num *= 2

            if (num >= 10) {
                var new = 0
                num.toString().forEach {
                    new += it - '0'
                }
                num = new
            }
        }

        sum += num
    }

    return sum % 10 == 0
}