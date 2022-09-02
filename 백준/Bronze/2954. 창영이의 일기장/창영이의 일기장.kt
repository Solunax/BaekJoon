import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val array = listOf('a', 'e', 'i', 'o', 'u')
    var pass = 0
    br.readLine().toString().forEach {
        if(it.code in 'a'.code .. 'z'.code ){
            if(pass == 0){
                bw.write("$it")
                if(array.contains(it))
                    pass = 2
            }else
                pass--
        }else
            bw.write("$it")
    }

    bw.close()
    br.close()
}