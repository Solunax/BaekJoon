import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val time = br.readLine().toInt()
        var late = 0

        for(i in 1 .. time){
            if(i + i * i <= time)
                late = i
            else
                break
        }

        bw.write("$late\n")
    }

    bw.close()
    br.close()
}