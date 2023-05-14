import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (start, end) = br.readLine().split(" ").map { it.toInt() }
    val arr = getPrime(end)
    var result = 0

    for(i in start .. end){
        var num = i
        var count = 0
        var index = 2

        while(num != 1){
            if(arr[index]){
                while(num % index == 0){
                    num /= index
                    count++
                }
                index++
            }else
                index++
        }

        if(arr[count])
            result++
    }
    bw.write("$result")

    bw.close()
    br.close()
}

fun getPrime(end : Int) : Array<Boolean>{
    val arr = Array(end + 1){true}
    arr[0] = false
    arr[1] = false

    for(i in 2 ..end){
        if(!arr[i])
            continue

        for(j in 2 * i .. end step i)
            arr[j] = false
    }

    return arr
}