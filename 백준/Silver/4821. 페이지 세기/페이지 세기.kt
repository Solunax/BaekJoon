import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true){
        val n = br.readLine().toInt()

        if(n == 0)
            break

        val input = br.readLine().split(",")
        val set = HashSet<Int>()

        input.forEach { str ->
            val splitValue = str.split('-').map { v -> v.toInt() }

            if(splitValue.size == 2){
                if(splitValue[1] <= n){
                    for(i in splitValue[0]..splitValue[1])
                        set.add(i)
                }else{
                    for(i in splitValue[0]..n)
                        set.add(i)
                }
            }else{
                val page = str.toInt()

                if(page <= n)
                    set.add(str.toInt())
            }
        }

        bw.write("${set.size}\n")
    }

    bw.close()
    br.close()
}