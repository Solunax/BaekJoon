import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val num = br.readLine().split("").filter { it.isNotEmpty() }.map { it.toInt() }.toTypedArray()

        for(i in num.size - 1 downTo 1){
            if(num[i] >= 5)
                num[i - 1] = num[i - 1] + 1

            num[i] = 0
        }

        bw.write("${num.joinToString("").toInt()}\n")
    }

    bw.close()
    br.close()
}