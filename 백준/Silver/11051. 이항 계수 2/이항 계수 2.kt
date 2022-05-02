import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val input = br.readLine().split(" ").map{ it.toInt() }
    val array = Array(1001){Array(1001){0} }

    array[0][0] = 1
    array[1][0] = 1
    array[1][1] = 1

    for(i in 1..input[0]){
        for(j in 0 .. i){
            if(j == 0)
                array[i][0] = 1
            else if(j == i)
                array[i][j] = 1
            else
                array[i][j] = (array[i-1][j] + array[i-1][j-1]) % 10007
        }
    }
    println(array[input[0]][input[1]])
    bw.flush()
    br.close()
    bw.close()
}