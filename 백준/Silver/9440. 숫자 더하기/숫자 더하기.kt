import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true){
        val input = br.readLine().split(" ").filter { it.isNotEmpty() }.map { it.toInt() }.toMutableList()

        if(input[0] == 0)
            break
        else{
            input.removeFirst()
            input.sort()
            
            val zeroCount = input.count { it == 0 }
            for(i in 0 until 2){
                input.add(0 + i, input[zeroCount + i])
                input.removeAt(zeroCount + 1 + i)
            }

            var flag = true
            var v1 = ""
            var v2 = ""
            input.forEach {
                if(flag)
                    v1 += it
                else
                    v2 += it
                flag = !flag
            }
            bw.write("${v1.toInt() + v2.toInt()}\n")
        }
    }

    bw.close()
    br.close()
}