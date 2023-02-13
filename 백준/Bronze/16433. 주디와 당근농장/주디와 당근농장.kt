import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, r, c) = br.readLine().split(" ").map { it.toInt() }
    val check = (r + c) % 2 == 0

    if(check){
        for(i in 1 .. n){
            for(j in 1 .. n){
                if((i + j) % 2 == 0)
                    bw.write("v")
                else
                    bw.write(".")
            }
            bw.write("\n")
        }
    }else{
        for(i in 1 .. n){
            for(j in 1 .. n){
                if((i + j) % 2 == 0)
                    bw.write(".")
                else
                    bw.write("v")
            }
            bw.write("\n")
        }
    }

    br.close()
    bw.close()
}