import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt() - 1
    val song = "baby sukhwan tururu turu very cute tururu turu in bed tururu turu baby sukhwan".split(" ")

    var index = 0
    var repeatCount = 0
    for(i in 0 until n){
        index++

        if(index > song.size - 1){
            index = 0
            repeatCount++
        }
    }

    if(song[index] == "tururu"){
        if(repeatCount >= 3)
            bw.write("tu+ru*${2 + repeatCount}")
        else{
            bw.write("tururu")
            repeat(repeatCount){
                bw.write("ru")
            }
        }
    }else if(song[index] == "turu"){
        if(repeatCount >= 4)
            bw.write("tu+ru*${1 + repeatCount}")
        else{
            bw.write("turu")
            repeat(repeatCount){
                bw.write("ru")
            }
        }
    }else
        bw.write(song[index])

    bw.close()
    br.close()
}