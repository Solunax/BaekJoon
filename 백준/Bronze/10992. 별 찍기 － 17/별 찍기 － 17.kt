import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var blank = 1
    for(i in 1 .. n){
        if(i == n){
            repeat(n * 2 - 1){
                bw.write("*")
            }
        }else{
            for(j in n downTo i + 1)
                bw.write(" ")
            bw.write("*")

            if(i != 1){
                repeat(blank){
                    bw.write(" ")
                }
                bw.write("*")
                blank += 2
            }
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}