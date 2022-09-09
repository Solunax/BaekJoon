import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main(){
    repeat(br.readLine().toInt()){
        val originAlpha = Array(26){0}
        val changedAlpha = Array(26){0}

        val (origin, changed) = br.readLine().split(" ")

        origin.forEach {
            originAlpha[it - 'a']++
        }

        changed.forEach {
            changedAlpha[it - 'a']++
        }

        var flag = true

        for(i in 0 until 26){
            if(originAlpha[i] != changedAlpha[i]){
                flag = false
                break
            }
        }

        if(flag)
            bw.write("Possible\n")
        else
            bw.write("Impossible\n")
    }

    bw.close()
    br.close()
}