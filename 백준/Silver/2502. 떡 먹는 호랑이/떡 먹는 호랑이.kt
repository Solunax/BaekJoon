import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (d, k) = br.readLine().split(" ").map { it.toInt() }
    val array = Array(d){ 0 }

    var flag = false
    for(i in 1 .. k / 2){
        for(j in i + 1 until k){
            array[0] = i
            array[1] = j

            for(m in 2 until d){
                array[m] = array[m-1] + array[m-2]
            }

            if(array[d - 1] == k){
                bw.write("${array[0]}\n")
                bw.write("${array[1]}")
                flag = true
                break
            }
        }

        if (flag)
            break
    }

    bw.close()
    br.close()
}