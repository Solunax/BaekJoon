import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = ArrayList<Int>()
    var max = 0

    repeat(n){
        val num = br.readLine().toInt()
        max = max(max, num)
        arr.add(num)
    }

    val prime = getPrime(max)

    repeat(n){
        val num = arr[it]
        var count = 0
        for(i in 2 .. num / 2){
            if(prime[i] && prime[num - i])
                count++
        }

        bw.write("$count\n")
    }

    bw.close()
    br.close()
}

fun getPrime(n : Int) : Array<Boolean>{
    val arr = Array(n + 1){true}
    arr[0] = false
    arr[1] = false

    for(i in 2 .. n){
        if(arr[i]){
            for(j in 2 * i .. n step i)
                arr[j] = false
        }
    }

    return arr
}