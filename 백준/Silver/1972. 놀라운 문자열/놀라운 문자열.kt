import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        val input = br.readLine()

        if(input == "*")
            break

        val len = input.length - 2
        var check = true
        for(i in 1 .. len){
            val set = HashSet<String>()

            for(j in 0 until input.length - i){
                val temp = "${input[j]}${input[j+i]}"

                if(set.contains(temp)){
                    check = false
                    break
                }else
                    set.add(temp)
            }

            if(!check)
                break
        }

        if(check)
            bw.write("$input is surprising.\n")
        else
            bw.write("$input is NOT surprising.\n")
    }

    bw.close()
    br.close()
}