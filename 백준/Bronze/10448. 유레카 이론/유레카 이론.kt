import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val n = br.readLine().toInt()

        val arr = ArrayList<Int>()
        for(i in 1 until n){
            val num = i * (i + 1) / 2
            arr.add(num)

            if(num > n)
                break
        }

        var result = 0
        for(i in 0 until arr.size){
            for(j in 0 until arr.size){
                for(k in 0 until arr.size){
                    if(arr[i] + arr[j] + arr[k] == n)
                        result = 1
                }
            }
        }

        bw.write("$result\n")
    }

    bw.close()
    br.close()
}