import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val channel = Array(n){""}

    repeat(n){
        channel[it] = br.readLine()
    }

    for(i in 0 until n){
        if(channel[i] == "KBS1"){
            for(j in i downTo 1){
                bw.write("4")
                channel[j] = channel[j - 1].also { channel[j - 1] = channel[j] }
            }

            break
        }else
            bw.write("1")
    }

    if(channel[1] != "KBS2"){
        for(i in 0 until n){
            if(channel[i] == "KBS2"){
                for(j in i downTo 2){
                    bw.write("4")
                    channel[j] = channel[j - 1].also { channel[j - 1] = channel[j] }
                }

                break
            }else
                bw.write("1")
        }
    }

    bw.close()
    br.close()
}