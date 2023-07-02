import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val sonar = Array(4){0}

    repeat(4){
        sonar[it] = br.readLine().toInt()
    }

    if(sonar[0] == sonar[1] && sonar[1] == sonar[2] && sonar[2] == sonar[3])
        bw.write("Fish At Constant Depth")
    else{
        var upCheck = true
        var downCheck = true

        for(i in 1 until 4){
            if(sonar[i - 1] < sonar[i])
                downCheck = false
            else if(sonar[i - 1] > sonar[i])
                upCheck = false
            else{
                upCheck = false
                downCheck = false
            }
        }

        if(upCheck)
            bw.write("Fish Rising")
        else if (downCheck)
            bw.write("Fish Diving")
        else
            bw.write("No Fish")
    }

    bw.close()
    br.close()
}