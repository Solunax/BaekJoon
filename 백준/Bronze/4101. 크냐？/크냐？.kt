import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main(){
    while(true){
        val (a, b) = br.readLine().split(" ").map{ it.toInt() }

        if(a == 0 && b == 0)
            break

        if(a > b)
            bw.write("Yes\n")
        else
            bw.write("No\n")
    }

    bw.close()
    br.close()
}