import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var flag = true
    repeat(5){
        if(br.readLine().contains("FBI")){
            flag = false
            bw.write("${it + 1} ")
        }
    }

    if(flag)
        bw.write("HE GOT AWAY!")

    bw.close()
    br.close()
}