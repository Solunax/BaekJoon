import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var count = 1

    while(true){
        val origin = br.readLine()
        val mixed = br.readLine()

        if(origin == mixed && origin == "END")
            break

        val v1 = origin.split("").filter { it.isNotEmpty() }.sorted()
        val v2 = mixed.split("").filter { it.isNotEmpty() }.sorted()

        if(v1.size != v2.size){
            bw.write("Case $count: different\n")
        }else{
            var flag = true

            for(i in v1.indices){
                if(v1[i] != v2[i]){
                    flag = false
                    break
                }
            }

            if(flag)
                bw.write("Case $count: same\n")
            else
                bw.write("Case $count: different\n")
        }
        count++
    }

    bw.close()
    br.close()
}