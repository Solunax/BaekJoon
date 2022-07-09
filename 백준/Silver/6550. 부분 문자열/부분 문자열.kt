import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true){
        try{
            val (sub, main) = br.readLine().split(" ")

            var flag = false
            var subIndex = 0
            for(i in main.indices){
                if(sub[subIndex] == main[i])
                    subIndex++

                if(subIndex == sub.length){
                    flag = true
                    break
                }
            }

            if(flag)
                bw.write("Yes\n")
            else
                bw.write("No\n")
        }catch (e:Exception){
            break
        }
    }

    bw.close()
    br.close()
}