import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val(n, k) = br.readLine().split(" ").map { it.toInt() }
    val array = Array(n + 1){true}
    array[0] = false
    array[1] = false
    var count = 1
    var result = 0

    for(i in 2 .. n){
        var v = 1
        while(i*v <= n){
            if(array[i*v]){
                array[i*v] = false
                if(count == k) {
                    result = i * v
                    break
                }
                count++
            }
            v++
        }

        if(result != 0)
            break
    }

    bw.write("$result")
    bw.close()
    br.close()
}
