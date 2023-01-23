import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val n = br.readLine().toInt()
        val whale = br.readLine().split(" ").sorted()
        val dolphin = br.readLine().split(" ").sorted()

        var flag = true
        for(i in 0 until n){
            if(whale[i] != dolphin[i]){
                flag = false
                break
            }
        }

        if(flag)
            bw.write("NOT CHEATER\n")
        else
            bw.write("CHEATER\n")
    }

    br.close()
    bw.close()
}

