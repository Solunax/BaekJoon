import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var result = 0
    repeat(br.readLine().toInt()){
        var (hour, minute, time) = br.readLine().split(":", " ").map{ it.toInt() }

        while(time != 0){

            result += when (hour){
                in 7 until 19 -> 10
                else -> 5
            }

            minute++

            if(minute == 60){
                minute = 0
                hour++

                if(hour == 24)
                    hour = 0
            }
            time--
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}