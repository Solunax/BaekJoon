import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val stick = ArrayList<Int>()

    repeat(br.readLine().toInt()){
        stick.add(br.readLine().toInt())
    }
    stick.sortDescending()

    var result = -1
    for(i in 0 until stick.size-2){
        for(j in i+1 until stick.size-1){
            if(stick[i] < stick[j] + stick[j+1]){
                result = stick[i] + stick[j] + stick[j+1]
                break
            }
        }

        if(result != -1)
            break
    }

    bw.write("$result")

    bw.close()
    br.close()
}