import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val num = br.readLine().split(" ").map { it.toInt() }

    for(i in -999 .. 999 ){
        for(j in -999 .. 999){
            if(num[0] * i + num[1] * j == num[2] && num[3] * i + num[4] * j == num[5]){
                bw.write("$i $j")
                break
            }
        }
    }

    bw.close()
    br.close()
}