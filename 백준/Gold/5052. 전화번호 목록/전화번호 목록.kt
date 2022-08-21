import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val n = br.readLine().toInt()
        val num = Array(n){""}

        for(i in 0 until n)
            num[i] = br.readLine()

        num.sort()
        var flag = true
        for(i in 0 until n - 1){
            if(num[i + 1].startsWith(num[i])){
                flag = false
                break
            }
        }

        if(flag)
            bw.write("YES\n")
        else
            bw.write("NO\n")
    }

    bw.close()
    br.close()
}