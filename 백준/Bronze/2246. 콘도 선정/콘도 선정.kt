import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val condo = Array(n){ Array(2){0} }

    repeat(n){
        condo[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
    }

    var result = 0
    for(i in 0 until n){
        var check = true

        for(j in 0 until n){
            if(i != j){
                if(condo[i][0] >= condo[j][0]){
                    if(condo[i][1] >= condo[j][1]){
                        check = false
                        break
                    }
                }

                if(condo[i][1] >= condo[j][1]){
                    if(condo[i][0] >= condo[j][0]){
                        check = false
                        break
                    }
                }
            }
        }

        if(check)
            result++
    }

    bw.write("$result")

    bw.close()
    br.close()
}