import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = br.readLine().split(" ").map { it.toLong() }.sorted()

    var max = arr.last()
    var sum : Long
    if(n == 1)
        bw.write("$max")
    else{
        if(n%2 == 0){
            for(i in 0 until n){
                sum = arr[i] + arr[n-1-i]
                if(max < sum)
                    max = sum
            }
        }else{
            for(i in 0 until n-1){
                sum = arr[i] + arr[n-2-i]
                if(max < sum)
                    max = sum
            }
        }
    }
    bw.write("$max")

    bw.close()
    br.close()
}