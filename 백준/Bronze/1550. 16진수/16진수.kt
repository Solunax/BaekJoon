import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val sb = StringBuilder()
    val num = listOf(8, 4, 2, 1)
    br.readLine().forEach {
        if(it in '0' .. '9'){
            var n = it - '0'
            for(i in 0 until 4){
                if(n - num[i] >= 0){
                    sb.append("1")
                    n -= num[i]
                }else
                    sb.append("0")
            }
        }else{
            var n = it - 'A' + 10
            for(i in 0 until 4){
                if(n - num[i] >= 0){
                    sb.append("1")
                    n -= num[i]
                }else
                    sb.append("0")
            }
        }
    }
    
    var result = 0
    var m = 1
    sb.reverse().toString().forEach {
        result += (it - '0') * m
        m *= 2
    }

    bw.write("$result")

    bw.close()
    br.close()
}
