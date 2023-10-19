import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val need = br.readLine().toInt()
    val remain = br.readLine().toInt()

    if(remain + 60 >= need){
        bw.write("${need * 1500}")
    } else {
        val over = need - 60 - remain
        bw.write("${(over * 3000) + ((need - over) * 1500)}")
    }

    bw.close()
    br.close()
}