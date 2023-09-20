import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val str = listOf("Never gonna give you up",
            "Never gonna let you down",
            "Never gonna run around and desert you",
            "Never gonna make you cry",
            "Never gonna say goodbye",
            "Never gonna tell a lie and hurt you",
            "Never gonna stop")

    var check = false

    for(i in 0 until br.readLine().toInt()){
        if(!str.contains(br.readLine())){
            check = true
            break
        }
    }

    bw.write(
        if(check) "Yes"
        else "No"
    )


    bw.close()
    br.close()
}