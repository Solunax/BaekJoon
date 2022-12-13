import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        var str = br.readLine() ?: break

        while(str.contains("BUG")){
            str = str.replace("BUG", "")
        }

        bw.write("$str\n")
    }

    br.close()
    bw.close()
}